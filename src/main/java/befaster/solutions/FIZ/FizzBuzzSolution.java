package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        // Ordinarily I'd write some tests first

        boolean canfizz = fizzable(number);
        boolean canbuzz = buzzable(number);
        boolean candeluxe = deluxAble(number);

        if (canfizz && canbuzz && candeluxe) {
            return "fizz buzz deluxe";
        }

        if(canfizz && candeluxe) {
            return "fizz deluxe";
        }

        if (canbuzz && candeluxe) {
            return "buzz deluxe";
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
