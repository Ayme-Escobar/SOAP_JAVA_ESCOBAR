from flask import Blueprint, render_template, request, session, jsonify, url_for, redirect


auth_bp = Blueprint('auth', __name__)


@auth_bp.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':        
        username = request.form.get('username')
        password = request.form.get('password')
       
        if username == "MasterMonster" and password == "Monster9":
            session['logged_in'] = True
            session['username'] = username
            return jsonify({"redirect": url_for('conversion.index')})
        else:
            error = "Usuario o contraseña incorrecta"
            return jsonify({"error": error}), 401
    return render_template('login.html')


@auth_bp.route('/logout', methods=['POST'])
def logout():
    session.clear()
    return redirect(url_for('auth.login'))
