from .unidad import Unidad

class Norris(Unidad):
    def __init__(self):
        super().__init__(vida=float('inf'))

    def disparar(self, objetivo):
        if objetivo.esta_vivo():
            objetivo.vida = 0