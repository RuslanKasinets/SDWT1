package class4;

import java.util.Scanner;

public class Dmv {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        if (age>=18){
            System.out.println("you will be issued a drivers licence");
        }
        else {
            System.out.println("you are not accepted");
        }

    }
}
