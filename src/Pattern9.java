public class Pattern9 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1)
                for (int j = 0; j < n; j++)
                    System.out.print("* ");
            else 
                for (int j = 0; j < n; j++) 
                    if (j == 0 || j == n - 1)
                        System.out.print("* ");
                    else 
                        System.out.print("  ");

            System.out.println();
        }
    }
}

// * * * * * * * * * *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// * * * * * * * * * *
