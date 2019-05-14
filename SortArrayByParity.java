package Easy;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] x = new int[A.length];
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]%2 == 0){
                x[count] = A[i];
                count++;
            }
        }
        for(int i = 0; i < A.length; i++){
            if(A[i]%2 == 1){
                x[count] = A[i];
                count++;
            }
        }
        return x;
    }
}
