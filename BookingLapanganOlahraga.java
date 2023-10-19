import java.util.Scanner;

public class BookingLapanganOlahraga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan menu lapangan
        System.out.println("Pilih Lapangan Olahraga yang Akan Disewa:");
        System.out.println("1. Lapangan Futsal");
        System.out.println("2. Lapangan Badminton");
        System.out.print("Masukkan Pilihan (1/2): ");
        int lapanganPilihan = input.nextInt();

        // Menentukan harga lapangan berdasarkan pilihan
        double hargaLapangan = 0.0;
        if (lapanganPilihan == 1) {
            hargaLapangan = 100.0; // Harga lapangan Futsal2
        } else if (lapanganPilihan == 2) {
            hargaLapangan = 40.0; // Harga lapangan Badminton
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Meminta jam booking
        System.out.print("Masukkan Waktu Booking (Pagi/Siang/Malam): ");
        String WaktuBooking = input.next();
        System.out.print("Masukkan Jam Booking (06:00-22.00): ");
        float JamBooking = input.nextFloat();

        // Meminta durasi booking
        System.out.print("Masukkan Durasi Booking (1-22): ");
        int DurasiBooking = input.nextInt();

        // Memvalidasi jam booking
        if (JamBooking < 6 || JamBooking > 22) {
            System.out.println("Jam booking tidak valid.");
            return;
        }

        // Menghitung total biaya
        double totalBiaya = hargaLapangan * DurasiBooking;

        // Menampilkan informasi booking
        System.out.println("\nBooking Lapangan Olahraga:");
        System.out.println("Lapangan: " + (lapanganPilihan == 1 ? "Futsal" : "Badminton"));
        System.out.println("Jam Booking: " + JamBooking + "0 - " + (JamBooking + DurasiBooking) + "0");
        System.out.println("Harga: Rp. " + hargaLapangan + "00");
        System.out.println("Total Biaya: Rp. " + totalBiaya + "00");

        // Meminta metode pembayaran
        System.out.print("\nPilih metode pembayaran (Cash/QRIS/E-Wallet): ");
        String metodePembayaran = input.next();

        // Memproses pembayaran
        if (metodePembayaran.equalsIgnoreCase("Cash")) {
            System.out.println("Silahkan Melakukan Pembayaran pada Admin dan Selamat Menikmati Permainan Anda!");
        } else if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            System.out.println("Silahkan Scan QR code!");
        } else if (metodePembayaran.equalsIgnoreCase("E-Wallet")) {
            System.out.println("Selamat Menikmati Permainan:)"); 
            // Simulasikan proses pembayaran kartu di sini
        } else {
            System.out.println("Metode pembayaran tidak valid.");
        }

        input.close();
    }
}


