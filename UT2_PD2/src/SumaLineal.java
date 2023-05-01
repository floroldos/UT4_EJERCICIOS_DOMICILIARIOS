import java.lang.reflect.Array;

public class SumaLineal {
    public int sumaLineal(int A[], int n){
        if (n == 1)
            return A[0];
        else
            return sumaLineal(A, n - 1) + A[n - 1];
    }
}
