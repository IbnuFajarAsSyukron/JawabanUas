
package Nomor2;

public class AntrianApp {
    public static void main(String[] args) {
        queue ngantri = new queue(10);
        ngantri.enqueue(9);
        ngantri.show();
        ngantri.enqueue(8);
        ngantri.show();
        System.out.println("Nilai yang paling depan = "+ngantri.peek());
        ngantri.enqueue(9);
        System.out.println("Nama Saya Adalah Ibnu Fajar As syukron");
        System.out.println();
        ngantri.show();
        System.out.println("Nilai yang diambil dari antrian = "+ngantri.dequeue());
        ngantri.show();
        System.out.println("Nilai yang paling depan = "+ngantri.peek());
    }
}

