package HomeWorkJava.Lesson1;

public class Task3 {
    public static void main(String[] args) {
        int wordCounter = 0;
        int lineCounter = 0;
        while (lineCounter <= 4) {
            while (wordCounter <= 9) {
                System.out.print("Nastya ");
                wordCounter++;
            }
            System.out.println();
            lineCounter++;
            wordCounter = 0;
        }
    }
}
