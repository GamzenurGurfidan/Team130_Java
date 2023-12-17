package day03_Scanner_dataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {

        // küçük data türündeki değeri, büyük data türündeki variable'a atamak isterseniz
        // java bunu otomatik olarak yapari buna Auto-Widening yani otomatik genişletme denir.

        byte a = 15;

        short b = a;

        int c = b;

        long d = c;

        double e = d;


        // büyük data türüneki değeri, küçük data türündeki variable'a atamak istersek
        // java bunu otomatik olarak yapmaz, sorumluluğu almamızı ister
        // büyük data türündeki değerin önüne parantez içinde çevirmek istediğimiz küçük data türünü yazarız
        // Explicit Narrowing

        double f = 34.5;

        int g = (int)f;

        short h = (short)g;

        byte k = (byte)h;








    }
}
