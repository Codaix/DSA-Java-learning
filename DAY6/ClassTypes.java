package DAY6;
   
/*
keywords:static and final.
static: makes the member public and independent of instantiation of the class/independent of existance of the object
        i.e. it wont be dependent on object creation rather can be directly called by class name.
final: The final keyword in Java is a non-access modifier used to apply restrictions on classes, methods, and variables.
       It ensures that the entity it modifies cannot be changed or extended.

classes: regular, nested/inner, abstract, final

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

public class ClassTypes{
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
//anonymous inner class