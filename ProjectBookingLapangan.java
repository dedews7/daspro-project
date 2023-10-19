import java.util.Scanner;

public class ProjectBookingLapangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG KAK!");

        boolean selesai = false; // Untuk menandai apakah pengguna selesai atau tidak

        do {
            // Menampilkan menu lapangan
            System.out.println("Pilih Lapangan Olahraga yang Akan Disewa:");
            System.out.println("1. Lapangan Futsal");
            System.out.println("2. Lapangan Badminton");
            System.out.print("Masukkan pilihan (1/2): ");
            int lapanganPilihan = input.nextInt();

            // Meminta Nama pengguna dan tanggal Booking
            System.out.print("Masukkan nama pengguna: ");
            String userName = input.nextLine();
            input.nextLine();
            System.out.print("Masukkan tanggal (DD-MM-YYYY): ");
            String tanggal = input.nextLine();
           
            // Menentukan harga lapangan berdasarkan pilihan
            double hargaLapangan = 0;
            if (lapanganPilihan == 1) {
                hargaLapangan = 100.000; // Harga lapangan Futsal
            } else if (lapanganPilihan == 2) {
                hargaLapangan = 40.000; // Harga lapangan Badminton
            } else {
                System.out.println("Pilihan tidak valid.");
                continue; // Mengulangi loop jika pilihan tidak valid
            }

            // Meminta jam booking
            System.out.print("Masukkan Waktu Booking (Pagi/Siang/Malam): ");
            String WaktuBooking = input.next();
            System.out.print("Masukkan Jam Booking (06.00-11.00): ");
            float jamBooking = input.nextFloat();

            // Meminta durasi booking
            System.out.print("Masukkan Durasi Booking (0-23): ");
            int durasiBooking = input.nextInt();

            // Memvalidasi jam booking
            if (durasiBooking < 1 || durasiBooking > 22) {
                System.out.println("Jam booking tidak valid.");
                continue; // Mengulangi loop jika jam booking tidak valid
            }

            // Menghitung total biaya
            double totalBiaya = hargaLapangan * durasiBooking;

            // Menampilkan informasi booking
           System.out.println("\nBooking Lapangan Olahraga:");
            System.out.println("Lapangan: " + (lapanganPilihan == 1 ? "Futsal" : "Badminton"));
            System.out.println("Jam Booking: " + jamBooking + "0 - " + (durasiBooking + jamBooking) + "0");
            System.out.println("Harga: Rp. " + hargaLapangan + "00");
            System.out.println("Total Biaya: Rp. " + totalBiaya + "00");

            // Meminta metode pembayaran
            System.out.print("\nPilih metode pembayaran (Cash/QRIS/E-Wallet): ");
            String metodePembayaran = input.next();

            // Memproses pembayaran
            if (metodePembayaran.equalsIgnoreCase("Cash")) {
                System.out.println("Silahkan Melakukan Pembayaran pada Admin dan Selamat Menikmati Permainan!");
            } else if (metodePembayaran.equalsIgnoreCase("QRIS")) {
                System.out.println("Silahkan Scan QR code!");
                System.out.println("Selamat Menikmati Permainan:)");
            } else if (metodePembayaran.equalsIgnoreCase("E-Wallet")) {
                System.out.println("Pilih E-Wallet Anda (ShopeePay/GoPay/DANA/OVO): ");
                String eWallet = input.next();
                System.out.println("Selamat Menikmati Permainan:)");
                // Simulasikan proses pembayaran kartu di sini
            } else {
                System.out.println("Metode pembayaran tidak valid.");
            }

            // Memeriksa apakah pengguna ingin melakukan pemesanan lagi
            System.out.print("\nApakah Anda ingin melakukan pemesanan lagi? (ya/tidak): ");
            String lanjutkan = input.next();
            if (!lanjutkan.equalsIgnoreCase("ya")) {
                selesai = true; // Mengakhiri loop jika pengguna tidak ingin melanjutkan
            }
        } while (!selesai);
        System.out.printf("TERIMAKASIH KAK, SEMOGA PUAS DENGAN PELAYANAN KAMI!");

        input.close();
    }
}
