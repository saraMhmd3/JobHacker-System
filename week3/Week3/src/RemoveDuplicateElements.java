import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

    public static void removeDuplicateElements(int arr1[], int size)
    {
        int arr2[] = new int [size];

        for(int i = 0; i < size-1; i++)
        {
            if(arr1[i] != arr1[i+1])
            {
              arr2[i] = arr1[i];
            }
        }

        for(int i = 0; i < size; i++){
           System.out.println( arr2[i]);
        }
    }

    public static void main(String[] args)
    {
        int size;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        removeDuplicateElements( arr, size);


    }
}
