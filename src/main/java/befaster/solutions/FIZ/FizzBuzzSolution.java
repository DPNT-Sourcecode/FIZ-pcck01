package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        // Ordinarily I'd write some tests first

        if ((fizzable(number)) && (buzzable(number))) {
            return "fizz buzz";
        }

        if (fizzable(number)) {
            return "fizz";
        }

        if (buzzable(number)) {
            return "buzz";
        }

        return number.toString();
    }

    private boolean fizzable(Integer number) {
        if (number % 3 == 0) {
            return true;
        }

        if (number.toString().indexOf('3') >= 0) {
            return true;
        }

        return false;
    }

    private boolean buzzable(Integer number) {
        if (number % 5 == 0) {
            return true;
        }

        if (number.toString().indexOf('5') >= 0) {
            return true;
        }

        return false;
    }
}
