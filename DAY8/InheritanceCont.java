package DAY8;
/*inheritance: 
 * it is a mechanism in which one class acquires the properties of another class.
 * 
 * types of inheritance:
 * 1. single inheritance: one class inherits from another class.
 * 2. multilevel inheritance: one class inherits from another class and that class inherits from another class.
 * 3. hierarchical inheritance: multiple classes inherit from a single class.
 * 4. multiple inheritance: one class inherits from multiple classes. (not supported by java)
 * 
 *
types:
single
multilevel
heirarcical inheritance
multiple //not supported by java
*/
class Animal{
    public void speak(){
        System.out.println("animal Speaks");
    }
}
class Dog extends Animal{//every protected and public membder will get inherited
    public void speak(){//method inheritance.
        System.out.println("Dog Barks");
    }
}
public class InheritanceCont {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        //by using the new keyword, memory will be allocated at the timr of running the programm. tthat's why, the program won't know that this line exist until we call it at sys out.
        d.speak();
        a.speak();
    }
}
