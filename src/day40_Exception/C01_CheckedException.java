package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src/day40_Exception/yazi.txt";

        // Java'da bilgisayirimizda varolan bir dosyaya ulasmak icin
        // FileInputStream classi kullanilir.

        try {

            FileInputStream fis = new FileInputStream(dosyaYolu);

        } catch (FileNotFoundException e) {

        }
        /*
            Unhandled exception: java.io.FileNotFoundException
            java bir dosyaya ulasmak istedigimizde
            o dosyaya ulaşabileceğinden emin olmak ister

            ve bizi bu konuda bir eylem yapmaya zorlamak için kodun altını kırmızı çize

            kodun altini kırmızı çizmesini
            bugüne kadar hep kodda hata var diye yorumlamıştık

            Anaak checked exceptionlarda
            java riski gorur ve onlem almamız için altını kızrmızı çizer

            javada dosyanın bilgi alma veya dosyaya bilgi yazdırma  ( input/outpu IO)
            ile ilgili exceptionlar checked exceptionlardir
            yani daha compile aninda java bu riskleri farkere
            ve bizden cozum ister

         */

        /*
            Checked exceptionlar için java bize iki alternatif sunar
                1 - su ana jadar yaptıgımız try catch ile sarmalayıp
                    sorun olussa bile calışmaya devam etmesini sağlayabiliriz

                2 - eger exceptionı kontrol altına alıp calışmaya devam etmesini istemiyorsanız
                    sadece kırmızı çizgiyi yok etmek kodlarımızı calısır hale getirmek
                    ve exception olusursa, kodlarimizin calismayi durdurmasini istersek
                    method deklerasyonuna riskin farkında oldugumuzu beyan eden
                    throws keyword yazmamız yeterlidir

                    throws FileNotFoundException:
                    method deklarasyonuna ekledigimiz bolum
                    riskin farkinda oldugumuzu soyler
                    Amma exceptioni kontrol altina almaz


         */

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

    }
}
