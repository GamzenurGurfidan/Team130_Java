package day28_PassByValue;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C01_StaticBlocks obj = new C01_StaticBlocks();

    }
    static {
        // bu yapıya statik blok denir
        // static blocklar her seyden hatta main methoddan bile once calisir
        // eger bir class icin main method calismadan yapilmasi gereken on ayarlar varsa
        // static block kullanarak yapılır

        // bir classda birden fazla static block olabilir
        // eger birden fazla static block varsa
        // kendi iclerinde once yukardaki calisir

        System.out.println("static block calisti");
    }
    static {
        System.out.println("ikinci static block calisti");
    }

    public static void  method1(){
        System.out.println("method1 calisti");
    }

}
