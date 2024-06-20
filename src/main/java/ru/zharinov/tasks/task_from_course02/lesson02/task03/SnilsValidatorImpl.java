package ru.zharinov.tasks.task_from_course02.lesson02.task03;

public class SnilsValidatorImpl implements SnilsValidator {
    @Override
    public boolean validate(String snils) {
        if (snils.equals("00000000000")) {
            return false;
        }
        boolean isValidate = false;
        if (snils.length() == 11 && snils.matches("\\d*")) {
            int lastTwoNumbers = Integer.parseInt(snils.substring(9));

            int sumOfNumber = 0;

            for (int i = 0; i < 9; i++) {
                sumOfNumber += (9 - i) * Integer.parseInt(snils.substring(i, i + 1));
            }

            while (sumOfNumber >= 100) {
                if (sumOfNumber == 100) {
                    sumOfNumber = 0;
                } else {
                    sumOfNumber %= 101;
                }
            }
            if (sumOfNumber == lastTwoNumbers) {
                isValidate = true;
            }
        }
        return isValidate;
    }
}
