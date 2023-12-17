package day38_Interfaces;

public interface I01_Interfaces {
    /*
        interfaceler class degildir
        KURAL 1 - interfaceler full abstraction saglar

        KURAL 2 - bir interface icinde olusturulan methodlar icin
                  public veya abstract keywordlerini yazmak redundant'dir
                  yani yazsak da yazmasak da bu özellikleri tasıyacagından
                  yazmak GEREKSİZ olur.

        KURAL 3 - bir interface icinde olusturulan variablelar icin
                  public, static veya finak keywordlerini yazmak redundanttır

        KURAL 4 - bir class birden fazla classi inherit EDEMEZ
                  ama birden fazla interfacei IMPLEMENT edebilir
                  hatta bir class bir classa extends edip, bunun yaninda
                  birden fazla interfacee de implement edebilir

        KURAL 5 - class ==> class inherit için extends
                  class ==> interface inherit için implements
                  interface ==> interface inherit icin extends
                  interface ==> classa inherit olmaz

        KURAL 6 - bir class birden fazla interfacei inherit ettiğinde
                  - parent interfacelerde ayni isimde variable varsa
                  secim yapmamızı isteri interfaceIsmi.VariableIsmi seklinde kullandirir
                  - parent interfacelerde ayni isimde method varsa
                   * eger return typelari ayni ise
                   hangisinden aldigi onemli olmaz
                   o method'u override ederiz
                   * eger return typelari FARKLI ise
                   overridding method hangi return typei secse
                   diger interface itiraz eder
                   bu durumda 2 interfaceden birine implement edebilir
                   otekini birakiriz


     */

    public abstract void method1();
    // Modifier 'public' is redundant for interface members
    // Modifier 'abstract' is redundant for interface methods

    public void method2();

    abstract void method3();

    void method4();

    public static final int sayi = 20;
    // Modifier 'public' is redundant for interface members
    // Modifier 'static' is redundant for interface fields
    // Modifier 'final' is redundant for interface fields

    public String STR = "Java";
    final boolean GUZEL_MI = true;
    char ILK_HARF = 'H';


}
