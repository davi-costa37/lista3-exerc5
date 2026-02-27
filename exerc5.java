package lista3rec;

import java.util.Scanner;

public class exerc5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int posicao;

        // Validação: posição entre 1 e 20
        do {
            System.out.print("Digite a posição da série de Fibonacci (1 a 20): ");
            posicao = scanner.nextInt();

            if (posicao < 1 || posicao > 20) {
                System.out.println("Valor inválido! Tente novamente.");
            }

        } while (posicao < 1 || posicao > 20);

        recursivacontrollerex5 controller = new recursivacontrollerex5();

        int resultado = controller.fibonacci(posicao);

        System.out.println("O valor na posição " + posicao + " é: " + resultado);

        scanner.close();
    }
}