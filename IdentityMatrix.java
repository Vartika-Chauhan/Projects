import java.util.*;

class IdentityMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n;
        System.out.println("Enter the number of rows:");
        m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        n = sc.nextInt();
        boolean flag = true;

        if (m == n) {
            System.out.println("Enter the elements in the matrix:");
            int arr[][] = new int[m][n];

          
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if ((i == j && arr[i][j] != 1) || (i != j && arr[i][j] != 0)) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }

           
            if (flag) {
                System.out.println("It is an Identity matrix");
            } else {
                System.out.println("It is not an Identity matrix");
            }
        } else {
            System.out.println("Matrix should be a square matrix.");
        }
    }
}