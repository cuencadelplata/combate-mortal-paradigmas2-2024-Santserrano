from engine.buque import Buque
from engine.soldado import Soldado
from engine.tanque import Tanque
from engine.norris import Norris

def test():
    soldado = Soldado()
    tanque = Tanque()
    buque = Buque()
    norris = Norris()

    assert soldado.esta_vivo()
    norris.disparar(soldado)
    assert not soldado.esta_vivo()

    assert tanque.esta_vivo()
    norris.disparar(tanque)
    assert not tanque.esta_vivo()

    assert buque.esta_vivo()
    norris.disparar(buque)
    assert not buque.esta_vivo()

    assert norris.esta_vivo()

    print("Test OK")

if __name__ == "__main__":
    test()