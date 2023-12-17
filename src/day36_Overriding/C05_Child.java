package day36_Overriding;

import day35_InheritanceDataTypeKullanimi.C04_Hayvanlar;

public class C05_Child extends C04_Parent {
    public void method1(int sayi) {
        // child classda parent classdan bir methodu
        // override etmek istersek signatureı
        // parent classdaki method ile ayni olan
        // bir method olusturmalıyıx
        // eger signature farli olursa
        // ismin ayni olmasi overriding için yeterli degildir
    }

    public void method2(){

    }

    @Override
    public void method3() {
        // overridding method olusturmak için
        // @Override notasyonu kullanmak zorunlu degildir
        // ama override methodu intelliJ 'e olusturtursak
        // intelliJ otomatik olarak notasyonu koyar
        // @override notasyonu parent classdaki
        // overriden methodu takip eder
        // silinir veya signatureu degisirilirse
        // CTE verir
        // Notasyon kullanılmayan methodlarda
        // parent classdaki method kontrol edilmez
        // degistirilmesi ve ya silinmesi durumunda
        // overriding özelligi biter ama kod çalısmaya devam eder

    }

    public static void method4 (){
        // static olaark işaretlenen methodlar
        // override edilemez
        // child classda aynı signature'a sahip method olusturabilrisiniz
        // ama bu ikisi overide iliskisi olusturmaz
        // bagımsız iki method olurlar

        // parent classta static olarak isaretlenen bir methodu
        // child classta aynı signature ile static keyword
        // kullanmadan Olusturamazsınız.
        // static yapmadan olusturmak iterseniz CTE verir

    }

    /*
    public final String method5() {

      // bir methodun final olarak isaretlerseniz
      // o method override edilemez

        return null;
    }
     */

    private void method6(){
        // private bir methodu override edemezsiniz
        // child classta ayni signaturea sahip
        // method olustursanız da
        // bu overriding method olmaz

    }

    protected void method7(){
        // her ne kadar signature'a dahil olmasa da
        // overriding de access modifier önemlidir
        // parent classtaki method7nin access modifierı
        // default oldugundan child clastaki method7
        // default , protected ya da public olmalıdır
        // ama private olamaz


    }

    public void method8(){
        // parent classtaki method8'in
        // access modifierı protected oldugundan
        // child classtaki method8
        // protected veya pulic olabilir
        // ama private veya default olamaz
    }

    public void method9(){
        // overriden methodun return typeı
        // void veya primitive ise
        // o zaman overriding methodun return typeı da AYNI olmalidir.
    }

    public String method10(){
        // eger overriden methodun return typeı
        // non primitive ise
        // overridding methodun return type'ı
        // YA aynisi olacak
        // YA DA parent classın return type'i ile
        // IS-A relationship olan bir data turu olacak

        return null;
    }

    @Override
    public void method11() {
        super.method11();
        // overridding yapıldıgında
        // overriden method veya overriding methoddan
        // sadece biri calısır

        // eger ikisinin de calısmasını isterseniz
        // super.methodIsmi yazarak
        // parentdaki methodun da calısmasını saglayabiliriz

    }
}





















