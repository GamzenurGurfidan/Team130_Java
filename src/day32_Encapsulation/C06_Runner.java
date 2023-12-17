package day32_Encapsulation;

public class C06_Runner {
    public static void main(String[] args) {
        /*
            Bir variableini private yapıp
            hem getter, hem setter methodu olusturursak
            PUBLİC gibi olur

            bu yontem bazı depler tarafından
            yapilan işleme vurgu yapmak amacıyla kullanılır

         */
        /*
            bir classdaki tum variablellar private yapılıp
            sadece getter methodları olusturulursa
            bu class read only (immutable) olur
         */

        C05_Encapsulation obj = new C05_Encapsulation();

        // isme deger atayabilir miyim?

        obj.setIsim("Gamze");

        //isim variableinin degerini yazdir

        System.out.println(obj.getIsim()); // Gamze

        // Soyisime deger atayalim
        obj.soyisim ="Guclu";
        System.out.println(obj.soyisim); // Guclu


    }
}
