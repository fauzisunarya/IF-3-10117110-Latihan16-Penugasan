
package pkgif.pkg3.pkg10117110.latihan16.penugasan;

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Operasi aritmatika
 */
public class IF310117110Latihan16Penugasan {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        
        
        a = 10;
        c = 15;
        c %=a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c << 2 = " + c);
        c >>= 2;
        System.out.println("c >> 2 = " + c);
        c >>= 2;
        System.out.println("c >> a = " + c);
        c &= a;
        System.out.println("c %= 2 = " + c);
        c ^= a;
        System.out.println("c ^= 2 = " + c);
        c |= a;
        System.out.println("c |= a = " + c);
        

    }
    
}
