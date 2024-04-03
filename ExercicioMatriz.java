import java.util.Scanner;

public class ExercicioMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.print("Insira a quantidade de linhas: ");
        m = sc.nextInt();
        sc.nextLine();
        System.out.print("Insira a quantidade de colunas: ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Insira os valores: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Insira o número da matriz que deseja saber as informações: ");
        int numeroBuscado = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == numeroBuscado) {
                    System.out.println("Número encontrado na posição: (" + i + ", " + j + ")");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < n - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado na matriz.");
        }

        sc.close();
    }
}
