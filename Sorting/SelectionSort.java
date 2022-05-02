package Sorting;

public class SelectionSort {

    public void selectioonsort(int[] a){
        for(int i = 0; i < a.length; i++){
            int minvalue = i;
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[minvalue]){
                    minvalue = j;
                }
            }
            if(minvalue != i){
                int temp = a[i];
                a[i] = a[minvalue];
                a[minvalue] = temp;
            }
        }
    }

    public void display(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();

        int array[] = {10,3,2,5,8,4,1,9};
        obj.selectioonsort(array);
        obj.display(array);

    }
}
