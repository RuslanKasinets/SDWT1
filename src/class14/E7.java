package class14;

public class E7 {
    void printLargest(int a,int b){
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        E7 e7=new E7();
       e7.printLargest(10,30);
    }
}
