from flask import Flask
from config import Config
from controlador.autenticacion_controlador import auth_bp
from controlador.conversion_controlador import conversion_bp


app = Flask(__name__)
app.config.from_object(Config)


# Registro de blueprints
app.register_blueprint(auth_bp, url_prefix='/')
app.register_blueprint(conversion_bp, url_prefix='/')


if __name__ == '__main__':
    app.run(debug=True)