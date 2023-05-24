package Exercicio;

public class Renault extends Carro {
    public Renault(String cor, int ano, int portas, double valor) {
        super("Renault", cor, ano, portas, valor, 0);
    }

    @Override
    public void partidaMotor() {
        super.partidaMotor();
    }
    @Override
    public void acelerar() {
        super.acelerar();
        velocidade += 10;
    }
    @Override
    public void freiar() {
        super.freiar();
        velocidade -= 5;
    }

}
