package DAY6;
/*Class and Objects:
 * 
*/

class Animal{
    int noOfLegs;
    void Speak(){
        System.out.println("animal Speaks");

    }
}

public class Classes{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Speak();
        a.noOfLegs = 10;
        System.out.println(a.noOfLegs);
    }
}
 