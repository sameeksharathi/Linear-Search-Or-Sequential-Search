public class SearchElementFromArray {
    int arr[]=new int[5];
    boolean found=false;
    public void searchingelement(int searchelement){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==searchelement){
                System.out.println("Element found at position "+ (i+1));
                found=true;
                break;
            }
        }
        if (found==false){
            System.out.println("Element not found.");
        }
    }
}
