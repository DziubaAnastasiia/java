package HomeWorkJava.Lesson1;

public class Task4 {
    public static void main(String[] args) {
        int word = 0;
        int line = 0;
        do {
            do {
                System.out.print("Nastya ");
                word++;
            } while (word <= 9);
            word = 0;
            System.out.println();
            line++;
        } while (line <= 4);
    }
}
