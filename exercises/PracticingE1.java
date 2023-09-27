package exercises;

import java.util.Scanner;

// 1.1

// Declare a variable of integer type, name it myAge.
// Assign the variable with your current age.
// do (a) and (b) as a one-line statement


// 1.2

// Declare a variable of String type, name it myFirstName.
// Assign the variable with your first name.
// do (a) and (b) as a one-line statement.

// 1.3

// Print the message "My name is {myFirstName} and I am {myAge} years old" to the terminal, using the variables from (1.1) and (1.2).
// 1.4

// Declare a variable of boolean type, and assign it with an allowed value of your choice.
// 1.5

// Consider the following variables: int x = 256; byte y = 8;
// Is the statement x = y; allowed? Why?
// Is the statement y = x; allowed? Why?


// 1.6

// Are the following variable declarations allowed? If not, why?
// int numberOfStudents = 23; //yes 
// char classroomIdentifier = 'B'; //yes
// int backgroundColor = "blue"; //No
// boolean above50%; //no
// boolean isNative = 0; //no
// String exampleString = "This is an example string"; //yes
// int gravitationalForce = 9.82; //no
// double gravitationalForce = 9.82;//yes
// byte screenResolutionX = 1024; //
// char smileyFace = '\u263a' //yes


// Consider a variable that is declared by the following code snippet: `Ship calypso = new Ship();`
// What is the type of the variable calypso?
// If we execute the statement System.out.println(calypso), we get a read-out Ship@4926097b. Explain what this output means.
// Consider the creation of a new Ship variable: Ship saoGabriel = calypso;.
// What would be the output of System.out.println(saoGabriel)?
// Explain the reason for the output in (c)

public class PracticingE1{

    
public static void main(String[] args) {

    //1.1
   int myAge = 30;

   String myFirstName = "Deeba";

   System.out.println("My name is " + myFirstName + " and I am " + myAge+" years old" );

   boolean possiblity = true;
   System.out.println(possiblity);

   Ship calypso = new Ship();
   System.out.println(calypso);

   Scanner input = new Scanner(System.in);

   int a = input.nextInt();
   System.out.println("value of a is "+a);

   double b = input.nextDouble();
   System.out.println("value of b is "+b);

  //input.nextLine();


   String c = input.nextLine();
   System.out.println("the message in c is "+c);


   input.close();

   


 
}
}

class Ship {

    


}


// 1.6 Extra

// Are the following variable declarations allowed? If not, why?
// int studentCount = "twenty";
// boolean isRaining = true;
// double piValue = 3.14159;
// char courseCode = 1024;
// String myAge = "25";
// int roomNumber = 'A';
// boolean hasPassed = "yes";
// float temperature = 98.6;
// byte numberOfSeats = 200;
// char grade = 65;
// String userName = 'John';
// boolean isActive = 1;
// int employeeSalary = 50000.50;
// double piConstant = 3.14;
// char initial = "M";
// boolean isTrue = true;
// byte numberOfPages = 3000L;
// float distance = 10.5F;
// String firstName = "Alice" + "Bob";
// char lastCharacter = "Hello".charAt(4);
// 1.9 Extra

// Evaluate the following expressions:
// 15 / 3;
// 8 - (5 + 2);
// 4 * (6 - 3);
// 7 + 3 * 2 - 1;
// 5 * 3 + 4 / 2;
// 10 % 3;
// (5 + 3) / 2;
// 6 + 4 - 2 * 3;
// 9 % 2 == 0;
// 8 >= 7 && 3 != 4;
// !(6 < 10) || (5 > 7 && 2 == 2);
// 'A' == 65 && 'B' != 66;
// (3 + 2) * (8 / 4) == 10;
// 4 * 3 - 2 + 8 / 4 != 4;
// "apple" == "apple";
// "apple" != "banana";
// 5 > 4 || 3 < 2 && 1 == 1;
// true && false || true;
// false ^ true && true;
// false || true && false;
