package DAY7;

//constructor: special method which is automatically provided by the class if 
//             not defined.
// // properties:
// Same name as class
// no return type
// it will be called only once in an object life time
// i.i. at the time of object creation
// used to initialise the class object

//Types of constructors: * default/non parameterized
//                       * parameterized
//                       * copy constructor.

class Student{
    String name;
    int age;
    //Default
    Student(){
    }

    //Parameterized 
    Student(String name, int age){
        name = this.name;
        age = this.age;
        System.out.println(this);
    }

    //copy Contructor: it is supposed to copy an object.
    Student(Student s){
        name = s.name;
        age = s.age;
    }
}
public class construct{
    public static void main(String[] args) {
        Student s = new Student("Pranav", 10);
        System.out.println(s);
    }
}
