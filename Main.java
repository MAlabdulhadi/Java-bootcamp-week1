import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /*

        1.Write a program that prints the numbers from 1 to 100 such that:
          If the number is a multiple of 3, you need to print "Fizz" instead of that number.
          If the number is a multiple of 5, you need to print "Buzz" instead of that number.
          If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
         */

//        for (int i= 1; i <=100 ; i++) {
//            if (i%3==0){
//                System.out.println("Fizz");
//            }
//            if (i%5==0){
//                System.out.println("Buzz");
//            }
//            if ((i%3==0)&&(i%5==0)){
//                System.out.println("FizzBuzz");
//            }
//                System.out.println(i);
//        }

        /*
        2.Write a Java program to reverse a string.
            Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT
         */

//        System.out.println("Input a string");
//        String textOrgianl = scan.nextLine();
//        String textReverse = "";
//        for (int i = 0; i <textOrgianl.length(); i++) {
//
//            textReverse =textOrgianl.charAt(i) + textReverse;
//
//        }
//        System.out.println(textReverse);
//
        /*

        3 - Write a program that prompts the user to input a positive integer.
         It should then print the multiplication table of that number.
         */

//        System.out.println("input a positive integer");
//        int numForMult = scan.nextInt();
//        System.out.println("Table Of multiplication for "+numForMult);
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numForMult+" "+"*"+" "+i+"= "+(numForMult*i));
//        }

        //4.Write a program to find the factorial value of any number entered through the keyboard.
//        System.out.println("input a number you want find factorial :");
//        int numWantFac = scan.nextInt();
//        int sum =1;
//        for (int i = numWantFac; i >=1; i--) {
//            sum *= i;
//        }
//        System.out.println("The sum Of factorial = "+sum);


        /*
        5.Two numbers are entered through the keyboard. Write a program to
        find the value of one number raised to the power of another.
        (Do not use Java built-in method)
         */

//        System.out.println("Enter the base number :");
//        int baseNum = scan.nextInt();
//        System.out.println("Enter the exponent of power");
//        int expPower = scan.nextInt();
//        int result=1;
//        for (int i = 1; i<=expPower;i++){
//            result *= baseNum ;
//        }
//        System.out.println(result);

        /*
        6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
         */
//
//        System.out.println("Enter numbers if you want stop write -1");
//        int number = 0;
//        int sumOfOdd = 0;
//        int sumOfEven = 0;
//        while(number != -1){
//            number = scan.nextInt();
//            if (number%2==0){
//                sumOfEven+=number;
//            }else {
//                sumOfOdd+=number;
//            }
//        }
//        System.out.println("the sum Of Even = "+ sumOfEven);
//        System.out.println("the sum of odd = "+sumOfOdd);

        /*
        7.Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.

         */

//        System.out.println("Enter a number ");
//        int numCheck = scan.nextInt();
//        boolean isPrime =true;
//        for(int i = 2 ; i<= numCheck/2;i++){
//            if (numCheck%i==0){
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime){
//            System.out.println("is Prime");
//        }else {
//            System.out.println("Not a prime");
//        }


        /*
        8.Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered.

         */

//        System.out.println("Enter numbers if you want stop write -1");
//        int numInput = 0;
//        int countForPos=0;
//        int countForNeq = 0;
//        int countForZero = 0;
//        while(numInput !=-1){
//            numInput = scan.nextInt();
//            if (numInput==-1){
//                break;
//            }
//            if (numInput<0){
//                countForNeq++;
//            }
//            if (numInput>0){
//                countForPos++;
//            }
//            if (numInput ==0){
//                countForZero++;
//            }
//        }
//        System.out.println("sum of positive = "+countForPos);
//        System.out.println("sum of Negative = "+countForNeq);
//        System.out.println("sum of zero = "+countForZero);


        /*
        9.Use a for loop to print headings for four weeks (Weeks 1 - 4).
        Then use another for loop to print the days (Days 1 -7) for each week.
         */
//        for (int i =1 ; i<=4;i++){
//            System.out.println("week "+i);
//            for (int j = 1; j <=7; j++) {
//                System.out.println("Day "+j);
//            }
//        }

        /*
        10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome
        if it is the same if we start reading it from left to right or right to left.
         */

//        System.out.println("Input a string");
//        String textOrg = scan.nextLine();
//        String textRev = "";
//        for (int i = 0; i <textOrg.length(); i++) {
//
//            textRev =textOrg.charAt(i) + textRev;
//
//        }
//        if (textOrg.equals(textRev)){
//            System.out.println("Yes Palindrome");
//        }else {
//            System.out.println("No Palindrome");
//        }







        


    }
}