from .unidad import Unidad

class Soldado(Unidad):
    def __init__(self):
        super().__init__(vida=1)