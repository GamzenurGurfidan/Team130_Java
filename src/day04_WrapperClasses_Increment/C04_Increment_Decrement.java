package day04_WrapperClasses_Increment;

public class C04_Increment_Decrement {
    public static void main(String[] args) {

        int a = 10;

        // a'nın değerini oluşturacağımız bir b veriable'ına atayın
        //sonra a'nın değerini 1 artırın

        int b = a;
        a++;

        System.out.println("a: " + a + ", b: " + b); // a: 11, b: 10

        a = 10;

        //a'nın değerini bir artır, sonra a'nın değerini b'ye atayın

        a++;
        b = a ;

        System.out.println("a: " + a + ", b: " + b); // a: 11, b: 11

        a = 10;

        //a'nın değerini yazdır, a'nın değerini 1 arttır

        System.out.println("a'nın değeri: " + a); //10
        a++;  //11

        a = 10 ;

        //1 arttır, sonra yazdır

        a++;
        System.out.println("a: " + a); //11



    }
}
