package day09_SwitchStatement;

public class C01_NestedTernary {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a > 5 ?
                    a > 0 ? 100 : 50
                :   a < 20 ? a + 5 : a - 5
        );
        System.out.println(b < a ?
                    b > 0 ? b + a : b- a
                :   a > 10 ? a * 5 : b / a
        );
        System.out.println(a == b ?
                    a > b ? a : b
                :   a < b ? a + b : a - b
        );

    }
}
