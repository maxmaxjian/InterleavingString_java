import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private String input1;
    private String input2;
    private String input3;
    private boolean expected;
    private Solution soln = new Solution1();

    public SolutionTest(String input1, String input2, String input3, boolean output) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {"aabcc", "dbbca", "aadbbcbcac", true},
                {"aabcc", "dbbca", "aadbbbaccc", false}
        });
    }

    @Test
    public void test() {
        assertEquals(expected, soln.isInterleave(input1, input2, input3));
    }
}