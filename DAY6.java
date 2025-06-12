/*Class and Objects:
 * 
*/
/*
class Animal{
    int noOfLegs;
    void Speak(){
        System.out.println("animal Speaks");

    }
}

public class DAY6{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Speak();
        a.noOfLegs = 10;
        System.out.println(a.noOfLegs);
    }
}
    */
/*keywords:static and final.
makes the member public and independent of iniciation of the class
classes: regular, nested, inner, abstract, final
nested:- class inside a class
- static
- non static
*/

//non static:
class A{
    int ov = 10;
    class InnerClass{
        void display(){
            ov++;
            System.out.println(ov);
        }
    }
}

//static:
class OC{
    private static int ov = 100;
    static class InnerC{
        void display(){
            ov++;
            System.out.println(ov);
        }
    }
}

//local inner class:
class LocalOuter{
    void check(){
        class LocalInnerCLass{
            void display(){
                System.out.println("From the display of local inner class");
            }
        }
        new LocalInnerCLass().display();
    }
}

public class DAY6{
public static void main(String[] args) {

    A oc = new A();
    A.InnerClass ic = oc.new InnerClass();
    ic.display();

    OC.InnerC ic2 = new OC.InnerC();
    ic2.display();

    LocalOuter lo = new LocalOuter();
    lo.check();
}
}