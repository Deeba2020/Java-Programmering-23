import java.util.Scanner;

public class MyMathMethodsE4 {

   

    public static int  factorial (int num){

        int result =1;

        if (num == 0){
            System.out.println("factorial of zero is: "+1);
            return 1;
        }
        
        else if (num < 0){
           System.out.println("The entered number can not be less than zero");
           return num;
        }


        else {
            for (int i =1 ; i<=num;i++){

                result = result*i;

            }

            return result;
        }
        
    }



    public static int FibonacciE4 (int num) {

        int current =1;
        int previous=  0;
        int fibonacci = 0;


        if (num <= 0){

            throw new IllegalArgumentException ("input can be zero and less than zero.");

        }

        else if (num == 1 || num ==2 ){
            return num-1;
        }


        else{
            for (int i =3 ; i<=num; i++){

                fibonacci = current+previous;
                previous= current;
                current =fibonacci;

                
            }
            return fibonacci;
        }

        
    }

    public static boolean isPrimeE4(int num){

        if (num % num == 1 & num %1 == num){
            
        }

        return true;

    }


    public static void main (String []args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter a num to find its factorial");

        int neededFac = input.nextInt();

        System.out.println(factorial(neededFac));
        

        
       System.out.println("enter a num to find its fibonacci");

       int neededFib = input.nextInt();
       
       System.out.println("Fibonacci is "+FibonacciE4(neededFib));

        input.close();
    }
    
}
