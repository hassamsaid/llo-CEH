import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        String operator;

        System.out.println("Bienvenido a la calculadora de Java.");
        System.out.print("Escribe el primer número de la operación: ");
        double result = scanner.nextDouble();

        while (true) {
            System.out.print("Escribe la operación a hacer (+, -) o escribe 'exit': ");
            operator = scanner.next();

            if (operator.equals("exit") || operator.equals("salir")) {
                break;
            }

            System.out.print("Escribe el siguiente número: ");
            number = scanner.nextDouble();

            switch (operator) {

                case "+":
                    result = Suma.sumar(result, number);
                    break;

                case "-":
                    result = Suma.restar(result, number);
                    break;

                // *

                // /

                default:
                    System.out.println("Error. Operación inválida.");
                    continue;
            }

            System.out.println("Resultado: " + result);

        }
    }
}
