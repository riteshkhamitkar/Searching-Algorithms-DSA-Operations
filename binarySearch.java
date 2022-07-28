.................
Main.java
.................
class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Searching.binarySearch(arr, 8);
    }
}

..................................
Searching.java
..................................
public class Searching {

    public static int linearSearch(int[] arr, int value){
        for(int i =0; i <arr.length; i++){
            if(arr[i]== value){
                System.out.println("The element is found at the index " + i);
                return i;
            }

        }
        System.out.println("The element " + value + "not found.");
        return -1;
    }

    //Binary Search

    public static int binarySearch(int arr[] , int value){
        int start = 0;
        int end = arr.length -1;
        int middle = (start+end)/2;
        System.out.println(start+ " " + middle + " " + end + " ");
        while(arr[middle] != value && start <=end){
            if(value < arr[middle]){
                end = middle -1;
            }else{
                start = middle + 1;
            }
               middle = (start+end)/2;
            
        }
        if(arr[middle] == value){
            System.out.println("The element is found at the index " + middle);
                return middle;
        }else{
            System.out.println("The element " + value + "not found.");
            return -1; 
        }
         
    }
}
...........
//////finish///////////
