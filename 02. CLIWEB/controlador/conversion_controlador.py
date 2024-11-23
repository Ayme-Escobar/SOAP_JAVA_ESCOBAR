from flask import Blueprint, render_template, request, session, redirect, url_for, jsonify
from modelo.conv_uni_service import ConvUniService


conversion_bp = Blueprint('conversion', __name__)
service = ConvUniService()


unidad_abreviatura = {
    "pulgadas": "in",
    "milimetros": "mm",
    "pies": "ft",
    "metros": "m",
    "yardas": "yd",
    "kilometros": "km"
}


@conversion_bp.route('/')
def index():
    if not session.get('logged_in'):
        return redirect(url_for('auth.login'))
   
    usuario = session.get('username', 'Usuario')
    return render_template('index.html', usuario=usuario)


@conversion_bp.route('/convertir', methods=['POST'])
def convertir():
    if not session.get('logged_in'):
        return jsonify({"error": "No autorizado"}), 403
   
    parametro = request.form.get('parametro')
    unidad = request.form.get('unidad')


    try:        
        if unidad == "pulgadas":
            result = service.cmAPulgadas(float(parametro))
        elif unidad == "milimetros":
            result = service.cmAMm(float(parametro))
        elif unidad == "pies":
            result = service.cmAPies(float(parametro))
        elif unidad == "metros":
            result = service.cmAM(float(parametro))
        elif unidad == "yardas":
            result = service.cmAYardas(float(parametro))
        elif unidad == "kilometros":
            result = service.cmAKm(float(parametro))
        else:
            return jsonify({"error": "Unidad no válida"}), 400
       
        abreviatura = unidad_abreviatura.get(unidad, "")
        return jsonify({"result": f"{parametro} cm en {unidad.capitalize()}: {result} {abreviatura}"})
   
    except Exception as e:
        print(f"Error: {e}")
        return jsonify({"error": "Error al conectar con el servicio SOAP"}), 500