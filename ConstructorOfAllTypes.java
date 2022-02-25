/*There Are Three Types Of Constructor:-
    1. Default Constructor
    2. Parameterized constructor
    3. copy Constructor
    */
class Student{
    String Name;
    int Roll ; 
    float Marks ; 

    Student(){
        Name = "default name";
        Roll = 0 ; 
        Marks = 0.0f;
    }
    Student(String name, int roll,float marks){
        this.Name = name;
        this.Roll = roll;
        this.Marks = marks;
    }
    Student(Student ob){
        this.Name = ob.Name;
        this.Roll = ob.Roll;
        this.Marks = ob.Marks;
    }
}
public class ConstructorOfAllTypes {
    
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student("1st name",45,98.98f);
        Student stud3 = new Student();
        stud3.Name = "3rd name";
        stud3.Marks = 87.98f;
        stud3.Roll = 43;
        Student stud4 = new Student(stud3);

        System.out.println("For 1St student");
        System.out.println("Name = "+stud1.Name);
        System.out.println("Roll = "+stud1.Roll);
        System.out.println("Marks = "+stud1.Marks);
        System.out.println();
        System.out.println("For 2nd student");
        System.out.println("Name = "+stud2.Name);
        System.out.println("Roll = "+stud2.Roll);
        System.out.println("Marks = "+stud2.Marks);
        System.out.println();
        System.out.println("For 4th student");
        System.out.println("Name = "+stud4.Name);
        System.out.println("Roll = "+stud4.Roll);
        System.out.println("Marks = "+stud4.Marks);


    }
}
