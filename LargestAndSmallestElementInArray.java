public class LargestAndSmallestElementInArray {
    int arr[]=new int[5];
    int temp1=0;
    int temp2=0;
    public void largestelement(){
        temp1=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp1 < arr[i + 1]) {
                temp1 = arr[i+1];
            }
        }
        System.out.println(temp1);
    }

    public void smallestelement(){
        temp2=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp2 > arr[i + 1]) {
                temp2 = arr[i+1];
            }
        }
        System.out.println(temp2);
    }
}
