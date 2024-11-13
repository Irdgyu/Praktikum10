import java.util.Scanner;
public class Tugas06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];

        for (int i = 0; i < hasilSurvei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j <hasilSurvei[i].length; j++) {
                System.out.print("Masukkan nilai survei (1-5) " + (j + 1) + " : ");
                hasilSurvei[i][j] = input6.nextInt();
                if (hasilSurvei[i][j] > 5 || hasilSurvei[i][j] < 1) {
                    System.out.println("Nilai yang dimasukkan tidak valid");
                    j--;
                    continue;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < hasilSurvei.length; i++) {
            int totalNilaiResponden = 0;
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalNilaiResponden += hasilSurvei[i][j];
            }
            double rata2NilaiResponden = (double) totalNilaiResponden / 6;
            System.out.println("Rata-rata penilaian dari responden" + (i + 1) + " : " + rata2NilaiResponden);
        }
        System.out.println();
        for (int j = 0; j < 6; j++) {
            int totalNilaiPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalNilaiPertanyaan += hasilSurvei[i][j];
            }
            double rata2NilaiPertanyaan = (double) totalNilaiPertanyaan / hasilSurvei.length;
            System.out.println("Rata-rata penilaian pertanyaan" + (j + 1) + " : " +rata2NilaiPertanyaan);
        }
        System.out.println();
        int totalNilaiKeduanya = 0;
        int jumlahKeduanya = 6 * 10;
        for (int i = 0; i < hasilSurvei.length; i++) {
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalNilaiKeduanya += hasilSurvei[i][j];
            }
        }
        double rataNilaiKeduanya = (double) totalNilaiKeduanya / jumlahKeduanya;
        System.out.println("Rata-rata nilai secara keseluruhan : " + rataNilaiKeduanya);
        input6.close();
    }
}