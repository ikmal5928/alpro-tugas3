public class jawaban {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Mencetak bintang sesuai dengan nomor baris saat ini
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            // Pindah ke baris baru setelah selesai mencetak bintang pada baris saat ini
            System.out.println();
        }
    }
}
