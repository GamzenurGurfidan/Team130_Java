package day33_Inheritance;

public class C04_RunnerClass {
    public static void main(String[] args) {

        C03_DizelCorolla dc1 = new C03_DizelCorolla();

        System.out.println(dc1.sansuman); // belirtilmemiş   A

        System.out.println(dc1.marka);    // Toyota   T
        System.out.println(dc1.guvenlik); // extra    T

        System.out.println(dc1.model);      // Corolla DC
        System.out.println(dc1.motor);      // Dizel   DC
        System.out.println(dc1.yakit);      // Dizel   DC
        System.out.println(dc1.uretimYeri); // Sakarya  DC
        System.out.println(dc1.aku);        // inci aku DC
        System.out.println(dc1.teker); // Pirelli 15    DC
        System.out.println(dc1.renk);  // belirtilmedi  DC
        System.out.println(dc1.fren);    // Abs fren    DC


    }
}
