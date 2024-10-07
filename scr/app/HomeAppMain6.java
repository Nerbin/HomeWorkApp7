package app;

public class HomeAppMain6 {

    public static void main(String[] args) {


        int [] Array = new int[7];
        int sum = 0;
        int numberOfSums =  Array[0] = 0;

        for (int index = 1; index < Array.length; index++) {
            Array[index] = index;

            numberOfSums = numberOfSums+Array[index];
            sum = sum+Array[index];

            System.out.printf("%d) Num is %d, sum is %d\n",index,index,numberOfSums);

        }

        System.out.println("--------------------");
        System.out.println("Sum of numbers is "+sum);

    }
}
