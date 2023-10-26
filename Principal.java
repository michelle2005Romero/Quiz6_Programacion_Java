import java.util.Scanner;

/**
 * Este es un programa para calcular el área y el perímetro de figuras geométricas como círculos, rectángulos y triángulos.
 * El usuario elige una figura y proporciona los datos necesarios para el cálculo.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Figuras Geométricas");
        System.out.println("Elija una figura: (1) Círculo, (2) Rectángulo, (3) Triángulo");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            Circulo circulo = new Circulo(radio);
            System.out.println("Área del círculo: " + circulo.getArea());
            System.out.println("Perímetro del círculo: " + circulo.getPerimetro());
        } else if (opcion == 2) {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = scanner.nextDouble();
            Rectangulo rectangulo = new Rectangulo(base, altura);
            System.out.println("Área del rectángulo: " + rectangulo.getArea());
            System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());
        } else if (opcion == 3) {
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();
            Triangulo triangulo = new Triangulo(base, altura);
            System.out.println("Área del triángulo: " + triangulo.getArea());
            System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());
        } else {
            System.out.println("Opción no válida. Elija una figura válida.");
        }

        scanner.close();
    }
}