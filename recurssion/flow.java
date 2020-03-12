package recurssion;

public class flow {
    public static void main(String[] args)
    {
        p4();
    }

    public static void p4() {
        System.out.println(4);
        p3();
        System.out.println("bye3");
    }

    public static void p3() {
        System.out.println(3);
        p2();
        System.out.println("bye2");
    }

    public static void p2() {
        System.out.println(2);
        p1();
        System.out.println("bye1");
    }

    public static void p1() {
        System.out.println(1);
        System.out.println("bye0");
    }
}
