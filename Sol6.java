package sol6;
import java.util.Scanner;
public class Sol6 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner input=new Scanner(System.in);
         System.out.println("Enter the intenger numbers count=10\nand fist number begin to 0");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the numbers "+ i +": ");
            int next = input.nextInt();
            array[i] = next;
            getMaxValue(array);
            }
            System.out.println("Max numbers is : "+getMaxValue(array));
    }
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}