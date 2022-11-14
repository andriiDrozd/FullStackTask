package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortedArrayTest {

    @Test
    public void sortTest(){

        SortedArray sortedArray=new SortedArray();
        int[] array=  {34,0,3456,4,-34,345,56,5,4,-345,4,-45,4,3323,0};
        List<Integer> expected=List.of(3456,3323,345,56,34,5,4,4,4,4,0,0);
        List<Integer> sortedList=sortedArray.sort(array);
        assertEquals(expected, sortedList);
    }

    @Test
    public void sortTestForZeroLength(){
        SortedArray sortedArray=new SortedArray();
        int[] array=  {};

        IllegalArgumentException thrown=Assertions.assertThrows(IllegalArgumentException.class, () -> {
             sortedArray.sort(array);
        });

        Assertions.assertEquals("The length of array cannot be 0", thrown.getMessage());
    }

    @Test
    public void sortTestForAllZeroValues(){
        SortedArray sortedArray=new SortedArray();
        int[] array=  new int[5];
        List<Integer> expected=List.of(0,0,0,0,0);
        List<Integer> sortedList=sortedArray.sort(array);
        assertEquals(expected, sortedList);
    }
}