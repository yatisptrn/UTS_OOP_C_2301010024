package uts_oop_2301010024;

class Barang {
    private int id;
    private String nama;
    private double harga;

    public Barang() {}

    public Barang(int id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public void update(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Harga: " + harga;
    }
}
