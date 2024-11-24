import hashlib
from flask import Blueprint, render_template, request, session, jsonify, url_for, redirect
from ec.edu.monster.modelo.usuario import Usuario

auth_bp = Blueprint('auth', __name__)

def hash_password(password):
    return hashlib.sha256(password.encode('utf-8')).hexdigest()

USUARIO_VALIDO = Usuario(
    username="Monster", 
    password=hash_password("Monster9") 
)

@auth_bp.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
    
        username = request.form.get('username')
        password = request.form.get('password')

    
        hashed_password = hash_password(password) 
        usuario = Usuario(username=username, password=hashed_password)

    
        if usuario.username == USUARIO_VALIDO.username and usuario.password == USUARIO_VALIDO.password:
        
            session['logged_in'] = True
            session['username'] = usuario.username
            return jsonify({"redirect": url_for('conversion.index')})

    
        error = "Usuario o contraseña incorrecta"
        return jsonify({"error": error}), 401
    
    return render_template('login.html')


@auth_bp.route('/logout', methods=['POST'])
def logout():
    session.clear()  # Eliminar todos los datos de sesión
    return redirect(url_for('auth.login'))
