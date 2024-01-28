public class jawaban {
    public static void main(String[] args) {
        // Output 2
        System.out.println("Output 2:");
        printNumberPattern(5);
    }

    // Metode untuk mencetak pola angka
    static void printNumberPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
