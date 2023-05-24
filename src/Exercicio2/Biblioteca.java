package Exercicio2;

public class Biblioteca {
    public String nomeLivro;
    public String generoLivro;
    public String autora;
    public int isbn;

    public int registrarLivro(int isbn) {
        System.out.print("O livro foi registrado com \nISBN: " + isbn);
        return isbn;
    }
    public String registrarLivro(int isbn, String nomeLivro) {
        System.out.print("O livro foi registrado com \nISBN: " + isbn +  "\nNome: "+ nomeLivro);
        return isbn + nomeLivro;
    }
    public String registrarLivro(int isbn, String nomeLivro, String generoLivro) {
        System.out.print("O livro foi registrado com: \nISBN: " + isbn + "\nNome: " + nomeLivro+ "\nGenero: " + generoLivro);
        return isbn + nomeLivro + generoLivro;
    }
    public String registrarLivro(int isbn, String nomeLivro, String generoLivro,String autora) {
        System.out.print("O livro foi registrado com o \nISBN: " + isbn + "\nNome: " + nomeLivro+ "\nGenero: " + generoLivro + "\nAutora: " + autora);
        return isbn + nomeLivro + generoLivro + autora;
    }



}
