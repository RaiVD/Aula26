package Exercicio;

public class Carro {
    protected String marca, cor;
    protected int ano,portas, velocidade;
    protected double valor;
    public Carro(String marca, String cor, int ano, int portas, double valor, int velocidade) {
        this.marca  = marca;
        this.cor = cor;
        this.ano = ano;
        this.portas = portas;
        this.valor = valor;
        this.velocidade = velocidade;
    }
    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }
    public int getAno() {
        return ano;
    }
    public int getPortas() {
        return portas;
    }
    public double getValor() {
        return valor;
    }

    public void partidaMotor() {
        System.out.println("Iniciando o motor… minha velocidade está em " + velocidade);
    }
    public void acelerar() {
        System.out.println("Acelerando… minha velocidade está em " + velocidade);
    }
    public void freiar() {
        System.out.println("Freando… minha velocidade está em " + velocidade);
    }


}
