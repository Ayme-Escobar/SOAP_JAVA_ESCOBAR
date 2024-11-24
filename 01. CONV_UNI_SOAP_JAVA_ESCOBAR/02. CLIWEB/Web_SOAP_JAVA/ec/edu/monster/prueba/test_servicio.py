import unittest
from ec.edu.monster.ws.servicio_soap import ServicioSOAP

class TestServicioSOAP(unittest.TestCase):
    def setUp(self):
        self.servicio = ServicioSOAP()

    def test_cm_a_pulgadas(self):
        resultado = self.servicio.cm_a_pulgadas(100)
        esperado = 39.37 
        self.assertAlmostEqual(resultado, esperado, places=2)

    def test_cm_a_metros(self):
        resultado = self.servicio.cm_a_m(100)
        esperado = 1.0
        self.assertEqual(resultado, esperado)

if __name__ == '__main__':
    unittest.main()
