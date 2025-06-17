package DAY9;
// interface: It is kind of a reference class in which we can declare only abstarct methods and variables.
// It is used to achieve abstraction and multiple inheritance in Java.
// It can have memeber variables which are by default public static and final.
// why and what is the need to use interface?
// E.g:
// let's take 2 branch companies.. both are of same size, and can accomodate 100 people,
// so, the amount of staff => size of the company.
// how they hire, depends in the management of the company.both managers can have different ways of hiring the staff.
// so hiring standards are different but set of people are the same.
// hence we use interface to achieve this by 
interface Animal{
    void speak();//common method

}
class Dog implements Animal{
    @Override
    public void speak() {// own implimentation of the common method
        System.out.println("Dog Barks");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.speak();
    }
}
