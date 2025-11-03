package Sekolah.UKL;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GanjirOrGenap {
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        boolean isThisSigma = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is elon musk.");
        System.out.println("A person who thinks all the time.");
        System.out.println("Inside his head are full of ideas all the time.");
        System.out.println("And now, its time for him to make a program that...");
        System.out.println("1. Mengurutkan bilangan 1 sampai x, lalu ditandai ganjil atau genap.");
        System.out.println("2. Memberi tau itu bilangan ganjil atau genap.");
        System.out.println("----------------------------------------------");
        System.out.println("But, when he wants to make the program, he is confused. Because there are two options. But, both have a same function. Only have a different Code.");
        System.out.println("Which one would you choose?");
        System.out.println("1. have continue");
        System.out.println("2. doesn't have continue");
        int differentCode = scanner.nextInt();
            if (differentCode == 1) {
        System.out.println("----------------------------------------------");
        System.out.println("So, choose.");

        System.out.println("1. Kamu input angka, nanti akan diurutkan dari bilangan 1 sampai bilangan yang kamu input tersebut, lalu ditandai ganjil atau genap.");
        System.out.println("2. Kamu input angka, lalu akan ditandai ganjil atau genap.");
            int choice = scanner.nextInt();
            if (choice == 1) {
                while (!isThisSigma) {
                System.out.println("Masukkan angka batas akhir: ");
                try {
                    x = scanner.nextInt();
                    isThisSigma = true;
                } catch (InputMismatchException e) {
                    System.out.println("Yang benar aja...");
                    System.out.println("--------------------------------");
                    System.out.println("input lagi sono!");
                    scanner.next();
                }
               for (i = 1; i <= x; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " adalah Bilangan Genap");
                    } else {
                        System.out.println(i + " adalah Bilangan Ganjil");
                    }
                }
            }
            } else if (choice == 2) {
                while (!isThisSigma) {
                System.out.println("Masukkan angka yang akan di cek ganjil atau genap: ");
                    try {
                        i = scanner.nextInt();
                        isThisSigma = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Yang benar aja...");
                        System.out.println("--------------------------------");
                        System.out.println("input lagi sono!");
                        scanner.next();
                        continue;
                    }
                    if (i % 2 == 0) {
                        System.out.println(i + " adalah Bilangan Genap");
                    } else {
                        System.out.println(i + " adalah Bilangan Ganjil");
                    }
            } 
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
    } else if (differentCode == 2) {
        System.out.println("----------------------------------------------");
        System.out.println("So, choose.");

        System.out.println("1. Kamu input angka, nanti akan diurutkan dari bilangan 1 sampai bilangan yang kamu input tersebut, lalu ditandai ganjil atau genap.");
        System.out.println("2. Kamu input angka, lalu akan ditandai ganjil atau genap.");
            int choice = scanner.nextInt();
            if (choice == 1) {
                while (!isThisSigma) {
                System.out.println("Masukkan angka batas akhir: ");
                try {
                    x = scanner.nextInt();
                    isThisSigma = true;
                    for (i = 1; i <= x; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " adalah Bilangan Genap");
                    } else {
                        System.out.println(i + " adalah Bilangan Ganjil");
                    }
                }
                } catch (InputMismatchException e) {
                    System.out.println("Yang benar aja...");
                    System.out.println("--------------------------------");
                    System.out.println("input lagi sono!");
                    scanner.next();
                }
            }
            } else if (choice == 2) {
                while (!isThisSigma) {
                System.out.println("Masukkan angka yang akan di cek ganjil atau genap: ");
                    try {
                        i = scanner.nextInt();
                        isThisSigma = true;
                        if (i % 2 == 0) {
                        System.out.println(i + " adalah Bilangan Genap");
                    } else {
                        System.out.println(i + " adalah Bilangan Ganjil");
                    }
                    } catch (InputMismatchException e) {
                        System.out.println("Yang benar aja...");
                        System.out.println("--------------------------------");
                        System.out.println("input lagi sono!");
                        scanner.next();
                        continue;
                    }
            } 
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }
            scanner.close();
        }
}
