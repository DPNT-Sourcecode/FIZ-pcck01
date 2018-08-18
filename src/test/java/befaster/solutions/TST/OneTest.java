package befaster.solutions.TST;

import befaster.solutions.FIZ.FizzBuzzSolution;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OneTest {
    private One one;

    @Before
    public void name() {
        one = new One();
    }

    @Test
    public void run() {
        assertThat(one.apply(), equalTo(1));
    }

    @Test
    public void fb27() {
        FizzBuzzSolution fbs = new FizzBuzzSolution();
        assertThat(fbs.fizzBuzz(27), equalTo("fizz"));
    }

}