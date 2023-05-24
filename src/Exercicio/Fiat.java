package Exercicio;

public class Fiat extends Carro {
    public Fiat(String cor, int ano, int portas, double valor) {
        super("Fiat", cor, ano, portas, valor, 3);
    }

    @Override
    public void partidaMotor() {
        super.partidaMotor();
    }
    @Override
    public void acelerar() {
        super.acelerar();
        velocidade += 12;
    }
    @Override
    public void freiar() {
        super.freiar();
        velocidade -= 6;
    }
}
