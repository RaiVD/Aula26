package Exercicio;

public class Hyundai extends Carro {
    public Hyundai(String cor, int ano, int portas, double valor) {
        super("Hyundai", cor, ano, portas, valor, 5);
    }
    @Override
    public void partidaMotor() {
        super.partidaMotor();
    }
    @Override
    public void acelerar() {
        super.acelerar();
        velocidade += 15;
    }
    @Override
    public void freiar() {
        super.freiar();
        velocidade -= 2;
    }
}
