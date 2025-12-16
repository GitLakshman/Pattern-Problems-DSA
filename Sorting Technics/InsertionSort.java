// Insertion Sort - select element and place its position
class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 2, 1, 4 };
        insertionSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length-1;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
