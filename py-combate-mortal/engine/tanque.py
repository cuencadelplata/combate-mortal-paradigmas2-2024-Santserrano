from .unidad import Unidad

class Tanque(Unidad):
    def __init__(self):
        super().__init__(vida=2)