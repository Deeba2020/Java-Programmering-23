package exercises.solutions.PracticingE3;

public class MainOne {

    public static void main(String []args){

        Home home = new Home();
       
        home.axel.name="axel";
        home.axel.weight=4.4;
        home.axel.age=3;

        System.out.println("welcome to home: "+home.homeName);

        System.out.println("following are inside home");

        System.out.println(home.axel.name);
        System.out.println(home.tusse.name);


        Dog secondDog = new Dog();
        secondDog.age= 20.0;
        secondDog.name ="cuddly";
        secondDog.weight =6;

        Dog thirdDog = home.axel;

        System.out.println("there are two dogs outside home");

        System.out.println(secondDog.name);
        System.out.println(thirdDog.name);
        

        home.axel.name="new axel";
        System.out.println(home.axel.name);
        System.out.println(thirdDog.name);
        

        

    }
    
}
