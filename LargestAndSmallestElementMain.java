import java.util.Scanner;

class LargestAndSmallestElementMain{
    public static void main(String[] args) {
        LargestAndSmallestElementInArray obj=new LargestAndSmallestElementInArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values in the array:");
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i]=sc.nextInt();
        }
        System.out.print("Largest element from the array: ");
        obj.largestelement();
        System.out.print("Smallest element from the array: ");
        obj.smallestelement();
    }
}
