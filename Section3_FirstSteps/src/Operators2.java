public class Operators2 {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1 (3 goes into 4 once)
        System.out.println("4 % 3 = " + result);

        // result = result + 1; Postfix Increment
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1; Decrement Operator subtracts 1 from the operand.
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) { // simplify !isAlien instead of ==
            System.out.println("It is not an alien");
            System.out.println("Let's phone home.");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You have the high score!");
        }

        int secondTopScore = 70;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        // OR operator
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or Both of these conditions are true");
        }

        int newValue = 60;
        if (newValue == 60){
            System.out.println("This is true.");
        }
    }
}
