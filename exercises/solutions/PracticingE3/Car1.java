package exercises.solutions.PracticingE3;

public class Car1 {

    String make;
    String model;
    int year;
    String color;

    Car1(String make, String model, int year,String color){
        this.make= make;
        this.model=model;
        this.year=year;
        this.color=color;
    }

    Car1(String make){
        this(make,"original",2023,"blue");
    }


    Car1(){
        this("default","standard",2000,"red");
    }

    public String toString(){

        return "make: "+this.make+'\n'+"model: "+this.model+'\n'+"year: "+this.year+'\n'+"color: "+this.color;

    }


    public static void main(String []args){
        Car1 a = new Car1("making","1999",1999,"brown");

       System.out.println( a.toString());
       System.out.println();

       Car1 b = new Car1("original");
       System.out.println( b.toString());

       System.out.println();


       Car1 c = new Car1();
       System.out.println( c.toString());




    }
    
}
