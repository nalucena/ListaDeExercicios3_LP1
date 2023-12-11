import java.util.Scanner;

public class Question5 {

        /* Joãozinho quer calcular e mostrar a quantidade de
           litros de combustível gastos em uma viagem, ao utilizar um
           automóvel que faz 12 KM/L. Para isso, ele gostaria que você o
           auxiliasse através de um simples programa. Para efetuar o
           cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e
           a velocidade média durante a mesma (em km/h). Assim,
           pode-se obter distância percorrida e, em seguida, calcular
           quantos litros seriam necessários. Mostre o valor com 3 casas
           decimais após o ponto. */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int desempenho = 12;

            System.out.println("Quantas horas foram gastas na viagem?");
            double horasViagem = input.nextDouble();

            System.out.println("Qual a velocidade média durante a viagem?");
            double velocidadeMedia = input.nextDouble();

            double combustivelNecessario = (calculoCombustivel(horasViagem, velocidadeMedia, desempenho));

            System.out.printf("A quantidade de combustível utilizada na viagem é de %.3f", combustivelNecessario);
            input.close();
        }

        public static double calculoCombustivel(double horasViagem, double velocidadeMedia, int desempenho) {
            return (horasViagem * velocidadeMedia) / desempenho;

        }

}
