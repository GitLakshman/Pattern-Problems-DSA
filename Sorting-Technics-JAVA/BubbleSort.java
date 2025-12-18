// Bubble Sort - select adjcent, comapre them, swap them

class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 2, 1, 4 };
        bubbleSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length-1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
