package numbers;

import java.util.Scanner;

public class Next10Num {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner read=new Scanner(System.in);
        int a= read.nextInt();

        for (int i=0;i<10;i++,a++){
            System.out.print(" "+a);
        }

    }

}
