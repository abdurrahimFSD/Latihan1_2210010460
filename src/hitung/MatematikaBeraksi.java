package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Object
        Matematika ahim = new Matematika(6, 0);
        
        System.out.println("Penjumlahan: " + ahim.setPenjumlahan());
        System.out.println("Pengurangan: " + ahim.setPengurangan());
        System.out.println("Perkalian: " + ahim.setPerkalian());
        System.out.println("Pembagian: " + ahim.setPembagian());
    }
}
