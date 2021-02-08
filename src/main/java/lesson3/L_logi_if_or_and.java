package lesson3;
public class L_logi_if_or_and {

public static void main(String[]args){
        int age = 30;
        int money = 100;

        // && - i
        // || - ili

        if((age < 18) && (money > 50)){
        System.out.println("Lets go to school and buy car");
        } else if(age < 60 || money > 100) {
        System.out.println("Lets go work and buy a car");
        } else //if(age > 60) {
        System.out.println("Let retire");
        }

        }


