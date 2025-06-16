package DAY7;

/*oops features: encapsulation, abstraction, polymorphism, inheritance
 * encapsulaltion: wrapping the things in one name. e.g. methods, enums
 * abstraction:    hiding the data from real world. interfaces are also one part of it. e.g. using of private keyword and making abstract classes.
 * polymorphism:   many forms. e.g. compile time: behaviour of code is defined at compilation/method overloading and run time: behaviour of code is defined at runtime./method overriding.
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
public class oops{
}
/*
 * question to ask: 
 * difference b/w {name = this.name;} and {this.name = name;}
 */