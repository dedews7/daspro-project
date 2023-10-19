import java.util.Scanner;

public class BookingLaundry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di layanan pemesanan laundry!");
        
        System.out.print("Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Alamat Anda: ");
        String alamat = input.nextLine();
        
        System.out.print("Nomor Telepon Anda: ");
        String nomorTelepon = input.nextLine();
        
        System.out.print("Jenis Layanan (Laundry biasa/Laundry kiloan): ");
        String jenisLayanan = input.nextLine();
        
        System.out.print("Jumlah pakaian: ");
        int jumlahPakaian = input.nextInt();
        
        // Anda dapat menambahkan logika tambahan di sini, seperti pengaturan tanggal dan waktu pengambilan dan pengiriman
        
        System.out.println("\nTerima kasih, berikut rincian pesanan Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Jenis Layanan: " + jenisLayanan);
        System.out.println("Jumlah pakaian: " + jumlahPakaian);
        
        // Logika lainnya untuk mengirim pesanan ke layanan laundry
        
        System.out.println("\nPesanan Anda telah berhasil diterima. Kami akan segera menghubungi Anda.");
        
        input.close();
    }
}