import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ex1
        System.out.print("Input first number:");
        int firstNumber = scan.nextInt();
        System.out.print("Input second number:");
        int secondNumber = scan.nextInt();
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
        System.out.println(firstNumber + "X" + secondNumber + "=" + (firstNumber * secondNumber));
        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
        System.out.println(firstNumber + "%" + secondNumber + "=" + (firstNumber % secondNumber));
        System.out.println("_____________________");
        //Ex 2
        System.out.println("Input a String:");
        String textToLower = scan.next().toLowerCase();
        System.out.println(textToLower);
        System.out.println("_____________________");

        //Ex 3
        System.out.print("Input a string: ");
        String text = scan.next();
        System.out.print("Input a number: ");
        int numOfIndex = scan.nextInt();
        System.out.println(text.charAt(numOfIndex));
        System.out.println("_____________________");

        //Ex 4
        System.out.println("Input a number: ");
        int numberForCheck = scan.nextInt();
        if (numberForCheck%2 ==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        System.out.println("_____________________");
        //Ex 5
        System.out.println("Enter your role");
        String role = scan.next().toLowerCase();
        if (role.equals("admin")){
            System.out.println("welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");
        }else{
            System.out.println("welcome user");
        }
        System.out.println("_____________________");

        //Ex 6
        System.out.println("Input the first number:");
        int numFirst = scan.nextInt();
        System.out.println("Input the second number:");
        int numSecond = scan.nextInt();
        System.out.println("Input the third number");
        int numThird = scan.nextInt();
        boolean result = (numFirst+numSecond) == numThird;
        System.out.println("The result is "+result);
        System.out.println("_____________________");

        //Ex 7
        System.out.println("Input the 1st number:");
        int number1 = scan.nextInt();
        System.out.println("Input the 2st number:");
        int number2 = scan.nextInt();
        System.out.println("Input the 3st number:");
        int number3 = scan.nextInt();
        int greatest;
        if ((number1>number2) && (number1>number3)){
            greatest = number1;
        } else if ((number2>number1)&&(number2>number3)) {
            greatest = number2;
        }else {
            greatest = number3;
        }
        System.out.println("The greatest: "+greatest);
        System.out.println("_____________________");
        //Ex 8
        System.out.println("Input number :");
        int numOfDay = scan.nextInt();
        switch (numOfDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a valid number ");
        }



    }

}