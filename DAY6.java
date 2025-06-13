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
//anonymous inner class


/*Que:
 * we are given with an integer array. it is a circular array. we need to tell the maximum
 * absolute diff between adjacent elements.
 * e.g.: arr[] = {1,2,4}
 * output: 3
 */
class Q4{
    int adjDiff(int arr[]){
        int maxi = -9999999;
        for(int i = 0; i<arr.length; i++){
            maxi = Math.max(maxi, Math.abs(arr[i] - arr[(i+1)%arr.length]));
        }
        return maxi;
    }
}
// my solution:

/*
class Diff{
    int adjDiff(int arr[]){
    int maxDiff = 0;
    if(arr.length < 2) return 0;
    maxDiff = Math.abs(arr[0] - arr[arr.length-1]);
    for(int i = 1; i<arr.length; i++){
        maxDiff = Math.max(maxDiff, Math.abs(arr[i] - arr[i-1]));
        }
        return maxDiff;
    }
}

class Q4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Diff d = new Diff();
        System.out.println(d.adjDiff(arr));
    }
    
}
*/