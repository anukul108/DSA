package Sorting;

public class InsertionSort {

    public void insertionsort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int array[] = {4,3,2,10,12,1,5,6,7,16};
        obj.insertionsort(array);
        obj.display(array);
    }
}
