from flask import Blueprint, render_template, request, session, redirect, url_for, jsonify
from ec.edu.monster.ws.servicio_soap import ServicioSOAP
from ec.edu.monster.modelo.conversion import Conversion

conversion_bp = Blueprint('conversion', __name__)

servicio_soap = ServicioSOAP()

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
    """
    Renderiza la página principal si el usuario está autenticado.
    """
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
    
    if not parametro or not unidad:
        return jsonify({"error": "Faltan parámetros requeridos"}), 400

    try:        
        parametro = float(parametro)
        
        conversion = Conversion(valor=parametro, unidad_origen="cm", unidad_destino=unidad)
        
        if unidad == "pulgadas":
            conversion.resultado = servicio_soap.cm_a_pulgadas(conversion.valor)
        elif unidad == "milimetros":
            conversion.resultado = servicio_soap.cm_a_mm(conversion.valor)
        elif unidad == "pies":
            conversion.resultado = servicio_soap.cm_a_pies(conversion.valor)
        elif unidad == "metros":
            conversion.resultado = servicio_soap.cm_a_m(conversion.valor)
        elif unidad == "yardas":
            conversion.resultado = servicio_soap.cm_a_yardas(conversion.valor)
        elif unidad == "kilometros":
            conversion.resultado = servicio_soap.cm_a_km(conversion.valor)
        else:
            return jsonify({"error": "Unidad no válida"}), 400
        
        abreviatura = unidad_abreviatura.get(conversion.unidad_destino, "")

        return jsonify({
            "result": f"{conversion.valor} cm en {conversion.unidad_destino.capitalize()}: {conversion.resultado} {abreviatura}"
        })

    except ValueError:
        return jsonify({"error": "El parámetro debe ser un número válido"}), 400
    except Exception as e:
        print(f"Error al conectar con el servicio SOAP: {e}")
        return jsonify({"error": "Error al conectar con el servicio SOAP"}), 500
