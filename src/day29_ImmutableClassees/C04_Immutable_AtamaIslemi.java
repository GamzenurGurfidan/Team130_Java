package day29_ImmutableClassees;

public class C04_Immutable_AtamaIslemi {
    public static void main(String[] args) {
        String isim = "Sedat";
        isim = isim.concat(" Yaman");
        System.out.println(isim); // Sedat Yaman

        isim = isim.toUpperCase();

        // 13den itibaren, 18.satıra kadar Java kaç tan obje olusturur. //101
        String str = "a";

        for (int i = 1; i <= 100 ; i++) {
            str += "a";

        }
        System.out.println(str);
    }
}
