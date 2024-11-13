import java.util.Scanner;
public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        next = "y";

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu 1 : Input data penonton");
            System.out.println("Menu 2 : Tampilkan daftar penonton");
            System.out.println("Menu 3 : Exit");
            System.out.print("Menu yang dipilih : ");
            menu = input6.nextInt();
            input6.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    nama = input6.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris : ");
                        baris = input6.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = input6.nextInt();
                        if (baris > 4 || kolom > 2) {
                            System.out.println("Maaf tidak tersedia");
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                
                    input6.nextLine();
                    penonton[baris-1][kolom-1] = nama;  
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i ++) {
                        System.out.println("Penonton baris ke-" + (i+1) + " : " + String.join("\t", penonton[i]));
                    }
                    break;
                case 3:
                    next = "n";
                    break;
                default:
                    System.out.println("Input menu tidak valid");
            }
            System.out.println();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}