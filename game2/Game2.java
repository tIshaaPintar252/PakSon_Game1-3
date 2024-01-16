import java.util.Scanner;

public class Game2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Drone drone = new Drone();
        drone.energi = 90;
        drone.ketinggian = 100;
        drone.kecepatan = 99;

        drone.belok();
        drone.maju();
        drone.matikanMesin();
        drone.mundur();
        drone.turun();

        System.out.println("Jalankan Dronenya!");
        // Meng set kecepatan drone
        // System.out.print("Masukkan kecepatan yang kamu inginkan pada drone: ");
        // String kecepatanDrone = scanner.nextLine();
        if (drone.terbang()) {
            System.out.println("Drone terbang");
        } else {
            System.out.println("Game over");
        }
    }
}

class Drone {
    int energi;
    int ketinggian;
    int kecepatan;

    void belok() {
        // Definisi belok
        System.out.println("Belok");
    }

    void maju() {
        // Definisi maju
        System.out.println("Maju");
    }

    void matikanMesin() {
        // Definisi matikanMesin
        System.out.println("Matikan Mesin");
    }

    void mundur() {
        // Definisi mundur
        System.out.println("Mundur");
    }

    void turun() {
        // Definisi turun
        System.out.println("Turun");
    }

    boolean terbang() {
        // Definisi terbang
        System.out.println("Terbang");
        return true; // Atau false tergantung logika game Anda
    }
}