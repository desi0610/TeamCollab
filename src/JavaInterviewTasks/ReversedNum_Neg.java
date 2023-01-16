package JavaInterviewTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversedNum_Neg {


        public static void main(String[] args) {
// solution 1
            Scanner sc = new Scanner(System.in);
            System.out.println(reverseNegativeNumber(sc.nextInt()));
//solution 2
            reverseNumber(-10);
// solution 3
            System.out.println(reverseNegativeNumber3(-10));
// solution 4
            reverseNum(-990);
// solution 5
            reverse(-20);

        }

        // Methods:

        //solution 1
        public static int reverseNegativeNumber(int number) {

            int p = number * (-1);// turn negative number to positive number
            int r = 0;  //  will save reversed number

            if (p > 9) { // if number is one digit ELSE  will work, it will reversed number itself

                while (p > 0) {
                    r = r * 10 + p % 10; //calculating reverse
                    p = p / 10; // cutting last digit

                /* Ex:
                   p = 245
                   1st loop: 245>0 true{
                             r = 0*10 + 245%10 = 5
                             p=245/10=24
                          }
                   2nd loop: 24>0 true{
                             r = 5*10 + 24%10 = 54
                             p=24/10=2
                          }
                   3rd loop: 2>0 true{
                             r = 54*10 + 2%10 = 542
                             p=2/10=0
                          }
                   4th loop: 0>0 false great no more loop.

                   At the end of the loop r = 542 & p=0
                 */
                }
            } else {
                return p * (-1); // will be one digit number, return itself

            }
            return r * (-1); // reversed number multiple by -1 to get negative version.

        }


        //solution 2

        public static int reverseNumber(int negativeNumber) {
            if (negativeNumber >= 0) {
                throw new InputMismatchException("Invalid number. Please use an negative number. " + negativeNumber);
            }

            String reverse = "";
            String toString = Integer.toString(negativeNumber);
            for (int i = toString.length() - 1; i >= 1; i--) {
                reverse += toString.charAt(i);
                negativeNumber = Integer.parseInt("-" + reverse);
            }

            System.out.println(negativeNumber);
            return negativeNumber;
        }


        // solution 3

        public static int reverseNegativeNumber3(int num) {
            if (num > 0) {
                throw new RuntimeException("You have to enter a negative number");
            }


            String reverseNumber = "";
            int reverse = 0;

            if (num < 0) {
                String stringNumber = String.valueOf(num * -1);  // converting int to string and *-1 for convert positive
                for (int i = stringNumber.length() - 1; i >= 0; i--) {
                    char each = stringNumber.charAt(i);
                    reverseNumber += "" + each;
                }
                reverse = Integer.parseInt(reverseNumber) * -1; // converting String to int
            }

            return reverse;


        }

        // solution 4
        //Number -- Reverse negative number
        public static int reverseNum(int num) {
            String str = new StringBuilder("" + num).reverse().toString();
            if (num < 0) {
                str = "-" + str.substring(0, str.length() - 1);
            }
            return Integer.valueOf(str);
        }


        //solution 5
        //Second solution for reverse negative number

        public static int reverse(int number) {
            if (number < 10 && number >= 0) {
                return number;
            }

            int result = 0;
            while (number != 0) {
                result = result * 10 + number % 10;
                number /= 10;
            }

            return result;
        }


    }

