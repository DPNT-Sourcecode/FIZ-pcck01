package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        // Ordinarily I'd write some tests first

        boolean canfizz = fizzable(number);
        boolean canbuzz = buzzable(number);
        boolean canfizzdeluxe = fizzdeluxable(number);
        boolean canbuzzdeluxe = buzzdeluxable(number);

        if (canfizz && canbuzz && (canfizzdeluxe || canbuzzdeluxe)) {
            return "fizz buzz " + deluxeString(number);
        }

        if(canfizz && canfizzdeluxe) {
            return "fizz " + deluxeString(number);
        }

        if (canbuzz && canbuzzdeluxe) {
            return "buzz " + deluxeString(number);
        }

        if (canfizz && canbuzz) {
            return "fizz buzz";
        }

        if (canfizz) {
            return "fizz";
        }

        if (canbuzz) {
            return "buzz";
        }

        return number.toString();
    }

    // Warning number MUST be deluxe
    private String deluxeString(Integer number) {
        if (number %2 == 0) {
            return "deluxe";
        }
        return "fake deluxe";
    }

    private boolean fizzable(Integer number) {
        if (number % 3 == 0) {
            return true;
        }

        return false;
    }

    private boolean fizzdeluxable(Integer number) {
        if ((number % 3 == 0) && (number.toString().indexOf('3') >= 0)) {
            return true;
        }

        return false;
    }

    private boolean buzzable(Integer number) {
        if (number % 5 == 0) {
            return true;
        }

        return false;
    }

    private boolean buzzdeluxable(Integer number) {
        if ((number % 5 == 0) && (number.toString().indexOf('5') >= 0)) {
            return true;
        }

        return false;
    }

}
