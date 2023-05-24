package Exercicio;

public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("Preto",2022, 4, 57000);
        Fiat fiat = new Fiat("Prata", 2015, 4,48000);
        Hyundai hyundai = new Hyundai("Branco", 2020, 4,67000);

        System.out.println("_______________________________________________________");
        System.out.println("Marca: " + renault.getMarca());
        System.out.println("Cor: " + renault.getCor());
        System.out.println("Ano: " + renault.getAno());
        System.out.println("Quantas Portas: " + renault.getPortas());
        System.out.println("Valor: R$"+renault.getValor());
        renault.partidaMotor();
        renault.acelerar();
        renault.acelerar();
        renault.freiar();
        renault.freiar();
        System.out.println("_______________________________________________________");

        System.out.println("Marca: " + fiat.getMarca());
        System.out.println("Cor: " + fiat.getCor());
        System.out.println("Ano: " + fiat.getAno());
        System.out.println("Quantas Portas: " + fiat.getPortas());
        System.out.println("Valor: R$"+fiat.getValor());
        fiat.partidaMotor();
        fiat.acelerar();
        fiat.acelerar();
        fiat.freiar();
        fiat.freiar();
        System.out.println("_______________________________________________________");

        System.out.println("Marca: " + hyundai.getMarca());
        System.out.println("Cor: " + hyundai.getCor());
        System.out.println("Ano: " + hyundai.getAno());
        System.out.println("Quantas Portas: " + hyundai.getPortas());
        System.out.println("Valor: R$"+hyundai.getValor());
        hyundai.partidaMotor();
        hyundai.acelerar();
        hyundai.acelerar();
        hyundai.freiar();
        hyundai.freiar();
        System.out.println("_______________________________________________________");





    }
}