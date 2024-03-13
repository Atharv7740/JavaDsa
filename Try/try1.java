package Try;
import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        System.out.println("hello");
        vote();
        green();
    }

    public static void vote(){
        Scanner sc=new Scanner (System.in);
        int a;
        System.out.print("Enter your age: ");
        a=sc.nextInt();
        if(a>18){
            System.out.println("You are Eligible to Vote");
        }
        else{
            System.out.println("You are not Eligible to Vote");
        }
    }
    public  static void green(){
        System.out.println("Green function called");
    }

}

