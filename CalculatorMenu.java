import java.util.Scanner;

public class CalculatorMenu {
    private Calculator calculator;
    private Scanner scanner;

    public CalculatorMenu() {
        calculator = new Calculator();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n---- Calculadora ----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo o residuo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese el primer número: ");
                int a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int b = scanner.nextInt();
                int resultado = 0;

                if ((opcion == 4 || opcion == 5) && b == 0) {
                    System.out.println("No se puede dividir entre cero");
                    continue;
                }

                switch (opcion) {
                    case 1:
                        resultado = calculator.add(a, b);
                        break;
                    case 2:
                        resultado = calculator.sub(a, b);
                        break;
                    case 3:
                        resultado = calculator.mul(a, b);
                        break;
                    case 4:
                        resultado = calculator.div(a, b);
                        break;
                    case 5:
                        resultado = calculator.mod(a, b);
                        break;
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcion != 0) {
                System.out.println("Opcion invalida, intente con otra");
            }

        } while (opcion != 0);

        System.out.println("Fin del programa");
    }
}
