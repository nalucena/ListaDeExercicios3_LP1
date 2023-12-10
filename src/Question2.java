import java.util.Scanner;

public class Question2 {


    /* Crie a função converterTemperatura(...), onde você deve
       receber a temperatura atual, a medida atual e a medida final.
       Após a conversão mostrar na tela o resultado final.
       Ex:
       Temperatura atual = 100
       Medida atual = celsius
       Medida final = kelvin
       Output = 373,15 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura atual: ");
        double temperaturaAtual = input.nextDouble();

        System.out.println("Digite a medida atual (celsius, fahrenheit, kelvin): ");
        String medidaAtual = input.next().toLowerCase();

        System.out.println("Digite a medida final (celsius, fahrenheit, kelvin): ");
        String medidaFinal = input.next().toLowerCase();

        double resultado = converterTemperatura(temperaturaAtual, medidaAtual, medidaFinal);

        System.out.println("Resultado da conversão: " + resultado);
    }

    public static double converterTemperatura(double temperaturaAtual, String medidaAtual, String medidaFinal) {
        double resultado = 0;

        if (medidaAtual.equalsIgnoreCase("celsius")) {
            if (medidaFinal.equalsIgnoreCase("kelvin")) {
                resultado = celsiusParaKelvin(temperaturaAtual);
            } else if (medidaFinal.equalsIgnoreCase("fahrenheit")) {
                resultado = celsiusParaFahrenheit(temperaturaAtual);
            }
        } else if (medidaAtual.equalsIgnoreCase("fahrenheit")) {
            if (medidaFinal.equalsIgnoreCase("celsius")) {
                resultado = fahrenheitParaCelsius(temperaturaAtual);
            } else if (medidaFinal.equalsIgnoreCase("kelvin")) {
                resultado = fahrenheitParaKelvin(temperaturaAtual);
            }
        } else if (medidaAtual.equalsIgnoreCase("kelvin")) {
            if (medidaFinal.equalsIgnoreCase("celsius")) {
                resultado = kelvinParaCelsius(temperaturaAtual);
            } else if (medidaFinal.equalsIgnoreCase("fahrenheit")) {
                resultado = kelvinParaFahrenheit(temperaturaAtual);
            }
        }

        return resultado;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinParaFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}

