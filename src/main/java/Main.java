import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAfter4 = {1,2,4,4,2,3,4,1,7};

        System.out.println(Arrays.toString(after4(arrayAfter4)));

        int[] array1and4test1 = {1,1,1,4,4,1,4,4};

        int[] array1and4test2 ={ 1,1,1,1,1,1};

        int[] array1and4test3 ={4,4,4,4};

        int[] array1and4test4 ={1,4,4,1,1,4,3};

        System.out.println(arr1and4only(array1and4test1));
        System.out.println(arr1and4only(array1and4test2));
        System.out.println(arr1and4only(array1and4test3));
        System.out.println(arr1and4only(array1and4test4));

    }




    public static int[] after4 (int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 4){
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("No 4rs in array");
    }

    public static boolean arr1and4only (int[] arr){
        boolean present1 = false;
        boolean present4 = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4 ){
                return false;
            }
            if(arr[i] == 1){
                present1 = true;
            }
            if(arr[i] == 4){
                present4 = true;
            }
        }
        return present1 && present4;
    }
}
