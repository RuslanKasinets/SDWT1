package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your salary");
        int salary=scanner.nextInt();
        if (salary>1000){
            System.out.println("you are rich");

        }else {
            System.out.println("look for better ");
        }
    }
}
