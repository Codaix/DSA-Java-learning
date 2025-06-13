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

public class DAY7{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
    }
}
