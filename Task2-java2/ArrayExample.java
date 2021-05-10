package session22;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        int j = 0;
        System.out.println("How many day's temps: ");
        Scanner scanner = new Scanner(System.in);
        int amountDays = scanner.nextInt();
        int[] temps = new int[amountDays];
        System.out.println("");
        for (int i = 0; i < amountDays; i++) {
            System.out.printf("Day "+(i + 1)+" 's high temps: ");
            Scanner scanner1 = new  Scanner(System.in);
            temps[i] = scanner1.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < amountDays; i++) {
            sum +=temps[i];
        }
        System.out.println("Average = " +sum/amountDays);

        for (int i = 0; i < amountDays; i++) {
            if(temps[i] > (sum/amountDays)) {
                j=j+1;
            }
        }
        System.out.println("%d days above" + j);
    }
}
