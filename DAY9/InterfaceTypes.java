package DAY9;
/* types of interfaces:
 * 1. functional interface: an interface which has only one abstract method. 
 *    it can have multiple default and static methods.
 * privillages of functional interface:
 *   - it can be used with lambda expressions. lambda method is a method which can be defined as ->.
 *   - it can be used with anonymous classes.
 * 
 */
interface Mammal {
    void habitat();
    void speak(); // this is not a functional interface as it has more than one abstract method.
}

@FunctionalInterface
interface Animal {
    void speak();
}
class Dog implements Animal, Mammal {
    @Override
    public void speak() {
        System.out.println("Dog Barks");
    }
    
    @Override
    public void habitat() {
        System.out.println("Dog lives in a kennel or house.");
    }
}
public class InterfaceTypes {
    public static void main(String[] args) {
        Dog obj  = new Dog();
        obj.speak();
        Animal obj2 = () -> System.out.println("From the lambda Expression of the functional interface");
        obj2.speak();// using lambda expression to implement the functional interface
        
        Mammal obj3 = new Mammal() {
            @Override
            public void habitat() { // using anonymous class to implement the Mammal interface
                System.out.println("Dog lives in a kennel or house.");
            }
            @Override
            public void speak() {// using anonymous class to implement the Animal interface by using only mammal interface
                System.out.println("Dog Barks from the anonymous class");
            };

        };
        obj3.speak();
        obj3.habitat(); // using anonymous class to implement the Mammal interface


    }
    
}
