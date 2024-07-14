import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaring the size of the array
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //Finding the element by implementing Linear/Sequential search
        System.out.println("Please enter the element you want to find :");
        int key = sc.nextInt();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index :" + i);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}