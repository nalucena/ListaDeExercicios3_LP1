import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        /* Escreva uma função que recebe o nome de um funcionário, seu
           número de horas trabalhadas por mês, o valor da hora e calcula
           o salário anual desse funcionário. (Mostre o valor com 2 casas
           decimais após o ponto).*/

        Scanner input = new Scanner(System.in);
        System.out.println("Para calcular o salário anual, por favor, digite as informações solicitadas: ");

        System.out.println("Digite o nome do funcionário: ");
        String nome = input.nextLine();

        System.out.println("Digite a quantidade de horas trabalhadas por mês: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();

        double salarioAnual = (calculadoraSalario(horasTrabalhadas,valorHora));
        System.out.printf("O sálario anual de %s é de R$%.2f", nome, salarioAnual);

        input.close();
    }

        public static double calculadoraSalario(double horasTrabalhadas, double valorHora) {

        return horasTrabalhadas * valorHora * 12;
    }
}
