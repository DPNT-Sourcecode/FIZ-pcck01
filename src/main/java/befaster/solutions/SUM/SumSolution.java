package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {
        validatArgument(x);
        validatArgument(y);

        return x + y;
    }

    public void validatArgument(int argument) throws IllegalArgumentException {
        if ((argument < 0) || (argument > 100)) {
            throw new IllegalArgumentException("argument out of bounds");
        }
    }
}
