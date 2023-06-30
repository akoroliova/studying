// this is a package declaration, if a class is within package then the file must start with package declaration.
// conventionally packages are named in all lower case
package chapter2;

// ?this means Scanner utility is imported
import java.util.Scanner;

// this is a class declaration. Class = java file.
// Orange words are reserved words in IntelliJ, we can't use them in naming
// in java class names are always camel case and start with upper case letter
// java is case-sensitive

public class GrossPayCalculator {
    // this is a default java method. In order to run any code within a CLASS it must be inside of a METHOD.
    public static void main (String arg[]){
        //1. Get the number of hours worked

        //1.1 Ask user to input the data
        System.out.println("Please insert the number of hours the employee worked.");

        //1.2 Scan what user has inputted (receive):
        Scanner scanner = new Scanner(System.in);
        //to actually read what we scanned, we use a method 'next' with data type 'number' or 'int' as integer,
        //and we declare this as variable of type 'int' with name 'hours' (see why - on 26-31 lines);
        //variable names are always camel case and start with lower case letter, this is a CONVENTION
        //the data info always goes to the right from equation sign, the data type and var name is always to the left:
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate

        //2.1 Ask user to input the data
        System.out.println("Please insert the hourly pay rate.");

        //2.2 Here we scan (receive) the user's input as an integer with a decimal (most commonly used type is 'Double':
        //and we declare this as variable of type 'Double' with name 'rate' (see why - on 26-31 lines);
        //the data info always goes to the right from equation mark, the data type and var name is always to the left:
        double rate = scanner.nextDouble();

        //2.3 This is the last usage of scanner, so we close it to free up memory space!
        scanner.close();

        //3. Multiply hours and pay rate
        //First we needed to store the data, to then reference it.
        //To store it, we need to have it as a variable and declare its type.
        //A variable is essentially a memory location. Variables can store all sorts of data.
        //Different types of data use diff amounts of memory location
        //So we declared our data as an integer type and double type, each with a name of variable.
        //Alltogether multiplied it would give us data with a decimal, so here we declare it this way:
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);


    }

}