import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAfter4 = {1,2,4,4,2,3,4,1,7};

        System.out.println(Arrays.toString(after4(arrayAfter4)));

        
    }




    public static int[] after4 (int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 4){
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("No 4rs in array");
    }
}
