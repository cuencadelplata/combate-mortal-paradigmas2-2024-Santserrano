from .unidad import Unidad

class Escudo:
    def __init__(self, porcentaje_proteccion):
        self.porcentaje_proteccion = porcentaje_proteccion

    def modificar_danio(self, danio):
        return danio * (1 - self.porcentaje_proteccion)