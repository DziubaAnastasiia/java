package lesson3;

public class P_Loops {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print("\n");
        }

        //for (int i = 0; i < 10; i++) {
        //System.out.println("Nastya" + 1);

        //for (int j = 5; j < 25; j+=5) {

        int increment = 0;

        while(increment < arr.length){
            System.out.println(arr[increment]);
            increment++;
        }

        increment = 0;
        do {
            System.out.println(arr[increment]);
            increment++;
        } while (increment < arr.length);

        // naoborot
        for (int i = arr.length - 1; i >=0; i --){
            System.out.println(arr[i]);
        }
    }
}
