from suds.client import Client
from ec.edu.monster.config import Config


class ServicioSOAP:
    def __init__(self):
        self.client = Client(Config.WSDL_URL)

    def cm_a_pulgadas(self, cm):
        return self.client.service.cmAPulgadas(cm)

    def cm_a_mm(self, cm):
        return self.client.service.cmAMm(cm)

    def cm_a_pies(self, cm):
        return self.client.service.cmAPies(cm)

    def cm_a_m(self, cm):
        return self.client.service.cmAM(cm)

    def cm_a_yardas(self, cm):
        return self.client.service.cmAYardas(cm)

    def cm_a_km(self, cm):
        return self.client.service.cmAKm(cm)
