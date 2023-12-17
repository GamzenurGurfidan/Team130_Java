package day12_StringManipulations;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str = "J1a34va12 C87an90d654ir";

        //metinden tum sayilari temizleyip
        //metni kaydedin

        //replaceAll tek tek harfleri, rakamlari degil
        //tum harfleri ya da tum rakamlarş diyebileceğimiz durumlarda kullanılır

        //ornegin bu soruda "tum sayilari yok etmemiz" lazim

        str = str.replaceAll("\\d","");
        System.out.println(str); //Java Candir

    }
}
