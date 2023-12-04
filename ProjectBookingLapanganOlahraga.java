import java.util.Scanner;

public class ProjectBookingLapanganOlahraga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG KAK!");

        String[][] riwayatPemesanan = new String[6][7];
        int jumlahBooking = 0;

        boolean selesai = false;
        do {
            System.out.println("Pilih Lapangan Olahraga yang Akan Disewa:");
            System.out.println("1. Lapangan Futsal");
            System.out.println("2. Lapangan Badminton");
            System.out.println("3. Cancel Booking");
            System.out.print("Masukkan pilihan (1/2/3): ");

            int lapanganPilihan;
            try {
                lapanganPilihan = input.nextInt();
            } catch (Exception e) {
                System.out.println("Pilihan tidak valid.");
                input.nextLine();
                continue;
            }

            switch (lapanganPilihan) {
                case 1:
                case 2:
                    double hargaLapangan = lapanganPilihan == 1 ? 100000 : 40000;
                    String lapangan = lapanganPilihan == 1 ? "Futsal" : "Badminton";

                    System.out.print("Masukkan Waktu Booking (Pagi/Siang/Malam): ");
                    String waktuBooking = input.next();

                    System.out.print("Masukkan Jam Booking (06.00-11.00): ");
                    float jamBooking;
                    try {
                        jamBooking = input.nextFloat();
                    } catch (Exception e) {
                        System.out.println("Jam booking tidak valid.");
                        input.nextLine();
                        continue;
                    }

                    System.out.print("Masukkan Durasi Booking (1-23): ");
                    int durasiBooking;
                    try {
                        durasiBooking = input.nextInt();
                    } catch (Exception e) {
                        System.out.println("Durasi booking tidak valid.");
                        input.nextLine();
                        continue;
                    }

                    if (durasiBooking < 1 || durasiBooking > 23) {
                        System.out.println("Jam booking tidak valid.");
                        continue;
                    }

                    double totalBiaya = hargaLapangan * durasiBooking;

                    System.out.println("\nBooking Lapangan Olahraga:");
                    System.out.println("Lapangan: " + lapangan);
                    System.out.println("Jam Booking: " + jamBooking + "0 - " + (durasiBooking + jamBooking) + "0");
                    System.out.println("Harga: Rp. " + hargaLapangan);
                    System.out.println("Total Biaya: Rp. " + totalBiaya);

                    System.out.print("\nPilih metode pembayaran (Cash/QRIS/E-Wallet): ");
                    String metodePembayaran = input.next();

                    if (metodePembayaran.equalsIgnoreCase("Cash")) {
                        System.out.println("Silahkan Melakukan Pembayaran pada Admin dan Selamat Menikmati Permainan!");
                    } else if (metodePembayaran.equalsIgnoreCase("QRIS")) {
                        System.out.println("Silahkan Scan QR code!");
                        System.out.println("Selamat Menikmati Permainan:)");
                    } else if (metodePembayaran.equalsIgnoreCase("E-Wallet")) {
                        System.out.print("Pilih E-Wallet Anda (ShopeePay/GoPay/DANA/OVO): ");
                        String eWallet = input.next();
                        System.out.println("Selamat Menikmati Permainan:)");
                    } else {
                        System.out.println("Metode pembayaran tidak valid.");
                    }

                    riwayatPemesanan[jumlahBooking][0] = String.valueOf(lapanganPilihan);
                    riwayatPemesanan[jumlahBooking][1] = String.valueOf(jamBooking);
                    riwayatPemesanan[jumlahBooking][2] = String.valueOf(durasiBooking);
                    riwayatPemesanan[jumlahBooking][3] = String.valueOf(hargaLapangan);
                    riwayatPemesanan[jumlahBooking][4] = String.valueOf(totalBiaya);
                    riwayatPemesanan[jumlahBooking][5] = metodePembayaran;
                    riwayatPemesanan[jumlahBooking][6] = waktuBooking;

                    jumlahBooking++;
                    break;
                case 3:
                    System.out.print("Masukkan ID Pemesanan yang ingin dibatalkan: ");
                    int idBooking = input.nextInt();
                    if (idBooking > 0 && idBooking <= jumlahBooking) {
                        for (int i = idBooking - 1; i < jumlahBooking - 1; i++) {
                            riwayatPemesanan[i] = riwayatPemesanan[i + 1];
                        }
                        jumlahBooking--;
                        System.out.println("Booking dengan ID " + idBooking + " telah dibatalkan.");
                    } else {
                        System.out.println("ID Pemesanan tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("\nApakah Anda ingin melakukan pemesanan lagi? (ya/tidak): ");
            String lanjutkan = input.next();
            if (!lanjutkan.equalsIgnoreCase("ya")) {
                selesai = true;
            }
        } while (!selesai);

        System.out.println("\nRiwayat Pemesanan:");
        for (int i = 0; i < jumlahBooking; i++) {
            System.out.println("Pemesanan ke-" + (i + 1));
            System.out.println("Lapangan: " + (riwayatPemesanan[i][0].equals("1") ? "Futsal" : "Badminton"));
            System.out.println("Jam Booking: " + riwayatPemesanan[i][1] + "0 - " + (Double.parseDouble(riwayatPemesanan[i][2]) + Double.parseDouble(riwayatPemesanan[i][1])) + "0");
            System.out.println("Harga: Rp. " + riwayatPemesanan[i][3]);
            System.out.println("Total Biaya: Rp. " + riwayatPemesanan[i][4]);
            System.out.println("Metode Pembayaran: " + riwayatPemesanan[i][5]);
            System.out.println("Waktu Booking: " + riwayatPemesanan[i][6]);
            System.out.println();
        }

        System.out.println("TERIMAKASIH KAK, SEMOGA PUAS DENGAN PELAYANAN KAMI!");

        input.close();
    }
}

