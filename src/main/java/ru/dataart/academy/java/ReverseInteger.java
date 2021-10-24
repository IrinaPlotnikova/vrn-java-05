package ru.dataart.academy.java;

import ru.dataart.academy.java.Exceptions.OutOfIntException;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        long reversedNumber = 0;
        boolean isNegativeInputNumber = inputNumber < 0;

        inputNumber = Math.abs(inputNumber);

        while (inputNumber != 0) {
            reversedNumber *= 10;
            reversedNumber += inputNumber % 10;

            inputNumber /= 10;
        }

        if (isNegativeInputNumber) {
            reversedNumber *= -1;
        }

        if (reversedNumber > Integer.MAX_VALUE) {
            throw new OutOfIntException("Reversed number is greater then " + Integer.MAX_VALUE);
        }
        if (reversedNumber < Integer.MIN_VALUE) {
            throw new OutOfIntException("Reversed number is less then " + Integer.MIN_VALUE);
        }


        return (int)reversedNumber;
    }
}
