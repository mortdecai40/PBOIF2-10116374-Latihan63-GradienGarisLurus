package pboif2.pkg10116374.latihan63.gradiengarislurus;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menampilkan hasil garis gradien melalui titik
 *
 */
public class PBOIF210116374Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat= new Koordinat (2,10,5,7);
        Koordinat koordinat2= new Koordinat (5,1,3,12);
        System.out.println("Garis yang memiliki Titik (2,10) dan (5,7)");
        System.out.print("memiliki gradien sebesar\t");
        System.out.println(koordinat.hitungGradien());
        System.out.println("Garis yang memiliki Titik (5,1) dan (3,12)");
        System.out.print("memiliki gradien sebesar\t");
        System.out.println(koordinat2.hitungGradien());
       
       
    }
    
}
