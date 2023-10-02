import java.util.Scanner;

public class LendoEAtribuindo {
    public static void main(String[] args) {
        // aqui passamos a api de leitura do que o usuario digita para a var leitura, a api é Scanner
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("filme: " + filme );
        System.out.println("anoDeLancamento: " + anoDeLancamento);
        System.out.println("avaliacao: " + avaliacao);
    }
}