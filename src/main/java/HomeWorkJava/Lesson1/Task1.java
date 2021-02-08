package HomeWorkJava.Lesson1;

public class Task1 {
    public static void main(String[] args)
    {
        int num1 = 89, num2 = 3, num3 = 7;
        System.out.println(min(num1, num2, num3));
    }
    public static int min(int a, int b, int c)
    {
        int answer;
        if(a < b && a < c){
            answer = a;
        }else if(c < b && c < a){
            answer = c;
        }else if(b < c && b < a){
            answer = b;
        }else{
            answer = 0;
            System.out.println("Use different numbers!");
        }
        return answer;
    }
}

