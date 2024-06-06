import java.util.Scanner;


public class ExemploSwitchCase {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana:");
        Integer diaDaSemana = leitor.nextInt();

        switch (diaDaSemana) {
            case 1 -> System.out.println("Aula de LP!");
            case 2 -> System.out.println("Terça!");
            case 3 -> System.out.println("Quarta!");
            case 4 -> System.out.println("Quinta!");
            case 5 -> System.out.println("Sextou");
            default -> System.out.println("Número inválido!");
        }

        String fruta = "Melancia";
        switch (fruta) {
            case "maça":
                System.out.println("Temos maça no estoque!");
                break;
            case "Melancia":
                System.out.println("Temos melancia no estoque!");
            case "Kiwi":
                System.out.println("Não é época de kiwi, não temos!");
            default:
                System.out.println("Não identifiquei a fruta digitada");
        }

    }
}
