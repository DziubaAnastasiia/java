package HomeWorkJava.Lesson1;

public class Task5 {
    public static void main(String[] args) {
        String str = "Hello world!!!";
        String str2 = new String();

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        System.out.println(str2);
    }
}

