/**
 * Lab8_2
 */
/*
 * Write a complete program to accept N integer numbers from the
command line. Raise and handle exceptions for following cases :
a. - when a number is –ve
b. - when a number is evenly divisible by 10
c. - when a number is greater than 1000 and less than 2000
d. - when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it
to find total sum.
 */
class NegativeNumber extends Exception{
    public NegativeNumber(String message){
        super(message);
    }
    
}
class EvenlyDivisibleBy10 extends Exception{
    public EvenlyDivisibleBy10(String message){
        super(message);
    }
}
class NumberGreaterThan1000AndLessThan2000 extends Exception{
    public NumberGreaterThan1000AndLessThan2000(String message){
        super(message);
    }
}
class NumberGreaterThan7000 extends Exception{
    public NumberGreaterThan7000(String message){
        super(message);
    }
}

public class Lab8_2 {

    public static void main(String[] args) {
        int sum = 0;
       try {
            for(int i = 0 ; i < args.length ; i++){
                int num = Integer.parseInt(args[i]);
                if(num < 0){
                    throw new NegativeNumber("Negative Number");
                }
                else if(num % 10 == 0){
                    throw new EvenlyDivisibleBy10("Evenly Divisible by 10");
                }
                else if(num > 1000 && num < 2000){
                    throw new NumberGreaterThan1000AndLessThan2000("Number greater than 1000 and less than 2000");
                }
                else if(num > 7000){
                    throw new NumberGreaterThan7000("Number greater than 7000");
                }
                sum += num;
            }
       } catch (NegativeNumber ne) {
            System.out.println(ne.getMessage());
            ne.printStackTrace();
       }
       catch (EvenlyDivisibleBy10 ee) {
            System.out.println(ee.getMessage());
            ee.printStackTrace();
       }
       catch (NumberGreaterThan1000AndLessThan2000 nge) {
            System.out.println(nge.getMessage());
            nge.printStackTrace();
       }
       catch (NumberGreaterThan7000 nge) {
            System.out.println(nge.getMessage());
            nge.printStackTrace();
       }
       System.out.println("Sum of Arrays: " + sum);
    }
}