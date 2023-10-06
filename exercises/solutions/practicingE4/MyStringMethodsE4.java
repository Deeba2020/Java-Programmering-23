import java.util.Scanner;

public class MyStringMethodsE4 {


    public static String reverseStringE4(String input){

        String s ="";


        for (int i = input.length()-1; i>=0;i--){

            s =  s+ input.charAt(i);

   }

    return s;
    }


    public static int countCharacters(String s, char m){

        int counter = 0;

        for (int i =0 ; i<= s.length()-1;i++){

            if (s.charAt(i) == m){

                counter++;
            }
        }

        return  counter;
    }




    public static void main (String []args){
        Scanner input = new Scanner (System.in);

        System.out.println("write a word to get reverse of it");

        String s = input.nextLine();

        System.out.println(reverseStringE4(s));


        System.out.println("write a word");
        String word = input.nextLine();

        System.out.println("write a character");
        char letter =input.next().charAt(0);

        System.out.println(countCharacters(word,letter));



        input.close();


        
    }
    
}
