import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int size;

        System.out.print("Enter Array size: ");
        size = sc.nextInt();
        int array[] = new int[size];
        ArrayInput(array);
        SortArray(array);
        System.out.println("");
    }
    static void ArrayInput(int[] array)
    {
        System.out.println("Length of array: " + array.length);
        System.out.println("Enter values");
        //Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println("\nActual array: ");
        PrintArray(array);
    }
    static void SortArray(int[] array)
    {
        for(int i=0; i < array.length; i++)
        {
            for(int j=i+1; j <array.length; j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("\nSorted array: ");
        PrintArray(array);
    }
    static void PrintArray(int[] array)
    {
        System.out.print("[ ");
        for(int i= 0; i<array.length; i++ ){
            System.out.print(array[i] + " ");
            }
        System.out.println("]");
    }
}
