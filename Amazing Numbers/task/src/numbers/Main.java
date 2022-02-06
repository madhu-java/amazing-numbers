package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n" +
               "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.\n");
        boolean exit= false;
        while(!exit){


        System.out.println("Enter a request:");
        long number = scanner.nextLong();
        boolean even=false;
        //boolean odd=false;
        boolean buzz=false;
        boolean duck =false;
        boolean isPalindrome =false;
         boolean isNotNatural= number<=0?true:false;
        if(isNotNatural){
            if(number==0){
                System.out.println("Goodbye!");
                exit=true;
            }else {
                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            }
        } else  {
            even = number % 2 == 0;
            buzz = number % 7 == 0 || number % 10 == 7;
            String numberString = "" + number;
            if (numberString.length()>1 && numberString.substring(1).contains("0")) {
                duck = true;
            }
            long pal = getPal(number);
            isPalindrome = pal==number;
            System.out.println("Properties of " + number + "\n" +
                    "        even: " + even + "\n" +
                    "         odd: " + !even + "\n" +
                    "        buzz: " + buzz + "\n" +
                    "        duck: " + duck +"\n"+
                    "  palindromic: " + isPalindrome);
        }
//            if(number%2==0){
//                even=true;
//               // System.out.println("This number is Even.");
//            }else{
//               // System.out.println("This number is Odd.");
//                odd=true;
//            }


//                   // System.out.println("It is a Buzz number.");
//                    buzz=true;
//
//                }else{
//                   // System.out.println("It is not a Buzz number.");
//                    buzz=false;
//                }
//            System.out.println("Explanaton:");
//                if(number%7==0) {
//                    if (number % 10 == 7) {
//                        System.out.println(number + "  is divisible by 7 and ends with 7.");
//                    } else {
//
//                        System.out.println(number + "is divisible by 7.");
//                    }
//                }else if (number % 10 == 7) {
//                    System.out.println(number + " ends with 7.");
//                } else
//                {
//                    System.out.println(number+" is neither divisible by 7 nor does it end with 7.");
//
//                    }
        }

    }

    private static long getPal(long number) {
        long pal=0;
        for(long num = number; num>0;){
            System.out.println("number:"+num);
            pal = (pal*10) + num%10;
            num /= 10;
        }
        return pal;
    }
}
