
public class twoDarray {
    public static void main(String[] args){
        int[][] arr = new int[6][6];
        hourglassSum(arr);
    }
    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int topSum = 0;
        for(int i = 1; i < arr.length-1; i++){
            for(int j = 1; j < arr[i].length-1; j++){
                sum += arr[i][j]; //mid
                sum += arr[i-1][j-1]; //top left
                sum += arr[i-1][j]; //top
                sum += arr[i-1][j+1]; //top right
                sum += arr[i+1][j-1]; //bot left
                sum += arr[i+1][j]; //bot
                sum += arr[i+1][j+1]; //bot right
                if(sum > topSum){
                    topSum = sum;
                }
                sum = 0;
            }
            
        }

        return topSum;

    }
}
