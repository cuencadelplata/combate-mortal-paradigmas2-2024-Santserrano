from .unidad import Unidad

class Buque(Unidad):
    def __init__(self):
        super().__init__(vida=3)