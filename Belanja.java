package Model;

public class Belanja {
    // properties
    private String namaBarang;
    private int jumlahBarang;
    private double hargaBarang;

    // getter and setter
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    // constructor 1 - tanpa parameter
    public Belanja() {
    }

    // constructor 2 - dengan parameter
    public Belanja(String namaBarang, int jumlahBarang, double hargaBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
    }

    // method cetak invoice
    public void cetakInvoice() {
        double subtotal = jumlahBarang * hargaBarang;
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Subtotal: " + subtotal);
    }
}
