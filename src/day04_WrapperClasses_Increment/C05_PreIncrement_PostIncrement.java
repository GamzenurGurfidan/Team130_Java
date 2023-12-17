package day04_WrapperClasses_Increment;

public class C05_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 10;

        a++;

        System.out.println("A'nın 10. satırda değeri: " + a); // 11

        a = 10;

        ++a;
        System.out.println("A'nın 15. satırda değeri: " + a); // 11

        /*
            Javada 3 farklı şekilde değer artırma mümkün
            -   sayi = sayi +1;
            -   sayi += 1;
            -   sayi++;

            sadece 3. yöntem için java ihtiyaca göre kullanılabilmesi amacıyla iki farklı kullanım oluşturmuştur.
            sayi++ yazabildiğimiz gibi ++sayi da yazabiliriz

        */

        int b = 10;
        System.out.println("++b yazdığımda konsolda yazdırılan " + ++b); //11
        System.out.println("++b'den 1 satır sonra konsolda b değeri " + b); // 11

        int c = 10;
        System.out.println("c++ yazdığımda konsolda yazdırılan " + c++); // 10
        System.out.println("c++'den 1 satır sonra konsolda b değeri " + c); // 11

        int x = 10;
        int y = x++;

        System.out.println("x: " + x + ", y: " + y); //x: 11, y: 10


        x = 10;
        y = ++x;

        System.out.println("x: " + x + ", y: " + y); //x: 11, y: 11

    }
}
