package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        // Ordinarily I'd write some tests first

        boolean canfizz = fizzable(number);
        boolean canbuzz = buzzable(number);
        boolean candeluxe = deluxAble(number);

        if (canfizz && canbuzz && candeluxe) {
            return "fizz buzz " + deluxeString(number);
        }

        if(canfizz && candeluxe) {
            return "fizz " + deluxeString(number);
        }

        if (canbuzz && candeluxe) {
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

        if (candeluxe) {
            return deluxeString(number);
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

    private boolean deluxAble(Integer number) {
        if (number < 10) {
            return false;
        }

        return allSameLetter(number.toString());
    }

    private boolean allSameLetter(String number) {
        for(char c : number.toCharArray()) {
            if (c != number.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
