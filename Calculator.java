

import java.util.Scanner;

public class Calculator {
   
    private static int getIntValue(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative number!");
        } else {
            return num;
        }
    }
    private static int getSum(String[] numbers) {
        int sum = 0;
        for (String num:numbers) {
            if (getIntValue(num) > 1000) {
                continue;
            }
            sum += getIntValue(num);
        }
        return sum;
    }
    
     public static int add(String input) {
        String[] numbers = input.split(",|\n");

        if (input.isEmpty()) {
            return 0;
        } else if (numbers.length > 1) {
            return getSum(numbers);
        }
        return getIntValue(input);
    }
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(add(input));
    }

   

}
