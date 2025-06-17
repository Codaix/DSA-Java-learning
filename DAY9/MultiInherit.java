package DAY9;
// achieving multiple inheritance using interface.
interface Mammal {
    void habitat();
}
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
/* Que:
why can't we have diamond problem as the interface? e.g. if we have same methods in both interfaces, then which method will be called?
for that we need to specify the class which is implementing the interface.
Diamond problem : when there is a class with a method and its child b and c inherits a and when a d class inherits b and c, then we had two instances of a in d.
but in interfaces, we don't have that problem because we can override the method in the class which is implementing the interface.
hence diamond problem is not applicable in interfaces.
*/
public class MultiInherit {
    
}
