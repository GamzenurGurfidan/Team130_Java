package day29_ImmutableClassees;

public class C05_StringPool {
    public static void main(String[] args) {

        /*
             Java String icin her seferinde yeniden obje olusturmamak icin
             basit bir mekanizma uretmistir

             buna String Pool diyoruz

             Java basit sekilde olusturulan
             String .... = "......" ;
             String objeleri String Pool'da tutar

             Sonradan yine bait yontemle
             yeni bir string olusturursanız
             once string poolu kontrol eder
             orada aynı derecee sahip eski bir String varsa
             yeni olusturdugumuz Stringe ayni referansi verir
         */

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String s = "Ja";
        String t = "va";
        String str5 = s.concat(t);

        //
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == "Java"); // true

        // equals() sadece metne bakar
        System.out.println("==========================");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals("Java")); // true

    }
}
