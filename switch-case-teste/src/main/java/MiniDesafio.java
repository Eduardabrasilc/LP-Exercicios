import java.util.Scanner;

public class MiniDesafio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar""");

        System.out.println("Digite uma das opções:");
        
        Integer numeroEscolhido;
        Integer numero01;
        Integer numero02;


        do {
            numeroEscolhido = input.nextInt();

        } while (numeroEscolhido != 1 && numeroEscolhido != 2 && numeroEscolhido != 3);


            switch (numeroEscolhido){
                case 1:
                    System.out.println(" Opção Somar escolhida ");
                    System.out.println("Escolha um numero: ");
                    numero01 = input.nextInt();
                    System.out.println("Escolha um segundo número: ");
                    numero02 = input.nextInt();
                    Integer soma = numero01 + numero02;
                    System.out.println(soma);
                    break;
                case 2:
                    System.out.println(" Opção Subtrair escolhida ");
                    System.out.println("Escolha um numero: ");
                    numero01 = input.nextInt();
                    System.out.println("Escolha um segundo número: ");
                    numero02 = input.nextInt();
                    Integer subtrair = numero01 - numero02;
                    System.out.println(subtrair);
                    break;
                case 3:
                    System.out.println(" Opção multiplicacao escolhida ");
                    System.out.println("Escolha um numero: ");
                    numero01 = input.nextInt();
                    System.out.println("Escolha um segundo número: ");
                    numero02 = input.nextInt();
                    Integer multiplicacao = numero01 * numero02;
                    System.out.println(multiplicacao);
                    break;
                default:
                    System.out.println("Opção inválida");
            }



    }
}
