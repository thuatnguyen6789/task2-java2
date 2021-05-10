package session22;

import java.util.Scanner;

public class InputInteger {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Input 5 integers");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        float avg = (float) sum / 5;
        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + i + "," + "typed value was" + " " + arr[i]);
        }
        System.out.println("Average is: " + avg);
    }
}
