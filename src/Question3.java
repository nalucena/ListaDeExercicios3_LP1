import java.util.Scanner;

public class Question3 {

    // Dado um número escreva uma função que retorna o seu fatorial.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que deseja realizar a fatoração: ");

        int numFatorial = input.nextInt();

        System.out.println("O fatorial de " + numFatorial + " é " + fatoracao(numFatorial));
    }

    public static int fatoracao(int numFatorial) {

        int fatorial = 1;

        for (int i = numFatorial; i > 1; --i) {
            fatorial *= i;

        }
        return fatorial;
    }
}