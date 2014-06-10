import org.junit.Test;

import static org.junit.Assert.*;

public class SUM2Test {

    @Test
    public void testSearch() {

        String testFile = "C:\\JavaProject\\CourseraHW\\algo1-programming_prob-2sum.txt";
        //String testFile = "C:\\JavaProject\\CourseraHW\\test2Sum.txt";

        SUM2 test = new SUM2(-10000, 10000, testFile);
        test.init();
        int result = test.findNumberOfT();

        System.out.println(result);

        //assertEquals(5, result);
    }



}