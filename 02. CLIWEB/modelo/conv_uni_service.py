from suds.client import Client
from config import Config


class ConvUniService:
    def __init__(self):        
        self.client = Client(Config.WSDL_URL)


    def cmAPulgadas(self, cm):
        return self.client.service.cmAPulgadas(cm)


    def cmAMm(self, cm):
        return self.client.service.cmAMm(cm)


    def cmAPies(self, cm):
        return self.client.service.cmAPies(cm)


    def cmAM(self, cm):
        return self.client.service.cmAM(cm)


    def cmAYardas(self, cm):
        return self.client.service.cmAYardas(cm)


    def cmAKm(self, cm):
        return self.client.service.cmAKm(cm)