/* final class:
final keyword: the memebr is the last and no new can be created.
final class: 
 * 
 */
/*
final class Animal{
    void speak(){
        System.out.println("Animal Speaks");
    }
}
*/

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
/*
public class DAY7{
    public static void main(String[] args) {
        Student s = new Student("Pranav", 10);
        System.out.println(s);
    }
}
    */

/*oops features: encapsulation, abstraction, polymorphism, inheritance
 * encapsulaltion: wrapping the things in one name. e.g. methods, enums
 * abstraction:    hiding the data from real world. interfaces are also one part of it. e.g. using of private keyword and making abstract classes.
 * polymorphism:   many forms. e.g. compile time: behaviour of code is defined at compilation and run time: behaviour of code is defined atruntime.
 * inheritance:    inherit a class and utilise or modify its properties in the child class. parent child classes.
 * 
*/

//Abstraction: class needs to be abstract to use sbstract keyword
abstract class Animal{// class is imcomplete... i.e. class is abstract
    private int noOfLegs;
    //in order to achieve abstract class, we need to have abstract method in that class
    /* in order to make abstract method, we have to declare a method with only its signature and not give it's definition
     */
    abstract void speak();

    int getLegs(){
        return noOfLegs;

    }
} // now to use this class, we need to inherit the class in a subclass. so, the functionality is hidden from the real world
  // and the class can be used freely.
  // concrete classs: who's object can be created.

  /* assignment: 
   * Que: we are supposed to created a matrix class inside which we are having a matrix. it provides methods as add, multiply and display.
   * we need to create two matrix objects. and perform add and display and similary we need to multiply and call the display method.
   */
public class DAY7{
}