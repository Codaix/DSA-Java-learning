/* final class:
final keyword: the memebr is the last and no new can be created.
final class: 
 * 
 */
final class Animal{
    void speak(){
        System.out.println("Animal Speaks");
    }
}

// this class can be called and object can be created of this but it cannot be 
// inherited and cannot be modified in any sense.
/*
public class DAY7{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
    }
}*/
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
public class DAY7{
    public static void main(String[] args) {
        Student s = new Student("Pranav", 10);
        System.out.println(s);
    }
}