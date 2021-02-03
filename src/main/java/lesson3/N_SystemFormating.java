package lesson3;

public class N_SystemFormating {
    public static void main(String[] args) {
        System.out.print("AAA");
        // System.out.println("AAA");
        System.out.println("BBB");

        String name = "Nastya";
        int money = 200;

        System.out.printf("Hello '%s' you won '$%d'", name, money);
        //%s - stroka . v dannom sluchae name
        //%d - chislo
    }
}
