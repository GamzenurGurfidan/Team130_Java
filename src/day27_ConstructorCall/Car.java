package day27_ConstructorCall;

public class Car {
    int fiyat = 50;



    public Car(int fiyat) {

        this.fiyat = fiyat;

    }

    public static void main(String[] args) {

        Car c1 = new Car(50);

        System.out.println(c1);

    }
}
