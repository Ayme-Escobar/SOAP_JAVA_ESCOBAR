import os


class Config:
    WSDL_URL = 'http://localhost:8080/WS_CONVUNI_SOAPJAVA/WSConvUni?wsdl'
    SECRET_KEY = os.urandom(24)