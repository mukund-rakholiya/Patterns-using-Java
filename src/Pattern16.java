public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
         }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
        }
    }
}

    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
