import java.util.Scanner;

class SimetricM {
    int[][] a, b;
    int x, y;

    void ReadArray() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        x = s.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        y = s.nextInt();

        a = new int[x][y];
        b = new int[x][y];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = s.nextInt();
            }
        }
        s.close();
    }

    void PrintArray() {
        System.out.println("\nMatrix A:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void SymArray() {
        if (x != y) {
            System.out.println("\nMatrix must be square (same number of rows and columns) to check for symmetry!");
            return;
        }

        // Transpose matrix
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = a[j][i];
            }
        }

        System.out.println("\nMatrix after Transpose:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Check for symmetry
        boolean isSymmetric = true;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (a[i][j] != b[i][j]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        if (isSymmetric) {
            System.out.println("\nMatrix is Symmetric.");
        } else {
            System.out.println("\nMatrix is NOT Symmetric.");
        }
    }

    public static void main(String[] args) {
        SimetricM obj = new SimetricM();
        obj.ReadArray();
        obj.PrintArray();
        obj.SymArray();
    }
}

