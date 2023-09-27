import java.util.Scanner;

public class ClassificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os comprimentos dos lados do triângulo:");
        System.out.print("Lado A: ");
        int ladoA = scanner.nextInt();

        System.out.print("Lado B: ");
        int ladoB = scanner.nextInt();

        System.out.print("Lado C: ");
        int ladoC = scanner.nextInt();

        // Check if it's a valid triangle
        if (isTriangleValid(ladoA, ladoB, ladoC)) {
            // Classify the triangle
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("É um triângulo equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo válido.");
        }

        scanner.close();
    }

    // Check if it's a valid triangle
    public static boolean isTriangleValid(int ladoA, int ladoB, int ladoC) {
        return (ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoA + ladoC > ladoB);
    }
}
