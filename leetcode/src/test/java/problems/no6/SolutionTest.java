package problems.no6;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 기본_테스트_케이스_1() {

        String s = "PAYPALISHIRING";
        int numRows = 3;

        assertThat("PAHNAPLSIIGYIR", is(equalTo(solution.convert(s, numRows))));
    }


    @Test
    void 기본_테스트_케이스_2() {

        String s = "PAYPALISHIRING";
        int numRows = 4;

        assertThat("PAYPALISHIRING", is(equalTo(solution.convert(s, numRows))));
    }

    @Test
    void 기본_테스트_케이스_3() {

        String s = "A";
        int numRows = 1;

        assertThat("A", is(equalTo(solution.convert(s, numRows))));
    }

}