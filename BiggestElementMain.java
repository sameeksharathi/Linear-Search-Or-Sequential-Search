import java.util.Scanner;

class BiggestElementMain{
    public static void main(String[] args) {
        BiggestElementInArray obj=new BiggestElementInArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values in the array:");
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i]=sc.nextInt();
        }
        System.out.print("Biggest element from the array: ");
        obj.biggestelement();
    }
}
