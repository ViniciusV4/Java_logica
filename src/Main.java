public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double notaDoFilme2 = 8.5;
        double notaDoFilme3 = 9.1;
        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento:" + anoDeLancamento + ". A nota é: " + notaDoFilme);

        int a = 5;
        int b = 5;
        double media = (notaDoFilme + notaDoFilme2 + notaDoFilme3) / 3;
        System.out.println(media);
        // casting para conersao para um inteiro:
        int converteMedia = (int) (media);
        System.out.println("Essa é a media convertida " + converteMedia);
    }

}
