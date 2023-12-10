import java.util.Scanner;

public class Question1 {

    /* Crie uma calculadora onde cada operação tem sua própria
       função. Ex: somar(...), subtrair(...), dividir(...), multiplicar(...)*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Escolha a operação que será realizada conforme o menu abaixo: ");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int operacao = input.nextInt();

        switch (operacao){
            case 1:
                System.out.println(somar(num1, num2));
                break;
            case 2:
                System.out.println(subtrair(num1, num2));
                break;
            case 3:
                System.out.println(multiplicar(num1, num2));
                break;
            case 4:
                System.out.println(dividir(num1, num2));
                break;
            default:
                System.out.println("Número da operação inválida, por favor, reinicie o programa.");
            }
    }

    public static double somar(double num1, double num2) {

        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {

        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {

        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {

        return num1 / num2;
    }
}

