import java.util.Scanner;

public class MyMathMethodsE4 {

   
    Scanner input = new Scanner (System.in);


    public static int  factorial (int num){

        int result =1;

        if (num == 0){
            System.out.println("factorial of zero is: "+1);
            return 1;
        }
        
        else if (num < 0){
           System.out.println("The entered number can not be less than zero");
           return 1;}


        else {
            for (int i =1 ; i<=num;i++){

                result = result*i;

            }

            return result;
        }
        
    }


    public static void main (String []args){

        
        

        MyMathMethodsE4.factorial(-1);

        MyMathMethodsE4.factorial(0);

       
        System.out.println(MyMathMethodsE4.factorial(5));
    }
    
}
