package HW1;

public class HW4 {
    public static void main(String[] args) {
        int [][] num={{2,3,3},
                     {2,4,5},
                     {1,1,2}};
        int sum=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];


            }

        }System.out.println(sum);

    }
}
