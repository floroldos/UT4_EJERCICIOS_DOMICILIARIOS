public class InvertirArray {
    public void intercambiar(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public void invertirArray(int A[], int i, int j){
        if(i < j){
            intercambiar(A, i, j);
            invertirArray(A, i + 1, j - 1);
        }
    }
}
