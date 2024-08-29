class Unidad:
    def __init__(self, vida):
        self.vida = vida
        self.escudo = None

    def disparar(self, objetivo):
        objetivo.recibir_disparo(1)

    def recibir_disparo(self, danio):
        if self.escudo:
            danio = self.escudo.modificar_danio(danio)
        self.vida -= danio

    def esta_vivo(self):
        return self.vida > 0

    def agregar_escudo(self, escudo):
        self.escudo = escudo