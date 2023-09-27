package exercises.solutions.PracticingE3;

public class Student1 {

    String name;
    int age;
    double grade;

    Student1(String name, int age, double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public String toString(){

        return " name "+this.name+"age"+this.age+"grade"+this.grade;

    }
    


    public static void main(String[] args) {
        
        Student1 a = new Student1("A",26,99.5);

        //System.out.println(" name "+a.name+'\n'+" age "+a.age+'\n'+" grade "+a.grade);
    
        System.out.println(a.toString());
    
    
    }

  
    
}
