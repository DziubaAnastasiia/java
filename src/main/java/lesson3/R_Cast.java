package lesson3;

public class R_Cast {
    public static void main(String[] args) {
        int a = 23;
        long b = a;

        long c = 34;
        c = 5342343434L;
        int d = (int)c;
        System.out.println(d);

        System.out.println((float)1/2);
    }
}
