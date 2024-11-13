import java.util.Scanner;
public class SIAKAD06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = input6.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumMatkul = input6.nextInt();

        int[][] nilai = new int[jumMhs][jumMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = input6.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/ nilai[i].length);
        }
        System.out.println("\n=====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/nilai.length);
        }
    }
}