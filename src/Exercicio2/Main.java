package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.print("\n_______________________________________________________________________________________________\n");
        System.out.print("Registrar livro com ISBN:\n");
        biblioteca.registrarLivro(123405876);
        System.out.print("\n_______________________________________________________________________________________________\n");
        System.out.print("Registrar livro com ISBN e Nome:\n");
        biblioteca.registrarLivro(123443221,"Para todos garotos que ja amei");
        System.out.print("\n_______________________________________________________________________________________________\n");
        System.out.print("Registrar livro com ISBN, Nome e Genero:\n");
        biblioteca.registrarLivro(192004833,"Dezesseis Luas"," Romance e Fantasia");
        System.out.print("\n_______________________________________________________________________________________________\n");
        System.out.print("Registrar livro com ISBN, Nome, Genero e Autor:\n");
        biblioteca.registrarLivro(192004833,"Dezoito Luas","Romance e Fantasia","Kami Garcia");
        System.out.print("\n_______________________________________________________________________________________________\n");

    }


}
