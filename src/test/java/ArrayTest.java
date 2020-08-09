import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void test1arr1and4only(){
        int[] testArr = new int[] {1,1,1,4,4,1,4,4};
        Assert.assertTrue(Main.arr1and4only(testArr));
    }
    @Test
    public  void test2arr1and4only(){
        int[] testArr = new int[]{ 1,1,1,1,1,1};
        Assert.assertFalse(Main.arr1and4only(testArr));
    }

    @Test
    public void test3arr1and4only(){
        int[] testArr = new int[]{4,4,4,4};
        Assert.assertFalse(Main.arr1and4only(testArr));
    }
    @Test
    public void test4arr1and4only(){
        int[] testArr = new int[]{1,4,4,1,1,4,3};
        Assert.assertFalse(Main.arr1and4only(testArr));
    }


}
