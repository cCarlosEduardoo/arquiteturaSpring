package io.github.cCarlosEduardoo.arquitetura.spring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
