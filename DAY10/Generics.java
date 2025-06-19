package DAY10;
/*Generics:
 * 1. Generics is a feature in Java that allows us to create classes, 
 * interfaces, and methods with a placeholder for the type of data they operate on.
 * 2. helps to create a class which is generic in nature. i.e. its object can hold any kind of type value.
 * benefits:
 * code redundandency is reduced
 * type safety is provided
 * saves time
 * easy maintenance
 */
class Record<E, K>{
    E arr[];//placeholder for the type of data
    K a;
    E get(int i){//placeholder for the type of data
        return arr[i];
    }
    // K covert(){
    //     K a;
    //     return a;
    // }

}
public class Generics {
public static void main(String[] args) {
    Record<Integer,String> r = new Record<>();
    r.arr = new Integer[10]; // creating an array of Integer type
    r.arr[0] = 10; // assigning value to the array  
    r.arr[1] = 20; // assigning value to the array
    r.arr[2] = 30; // assigning value to the array
    r.arr[3] = 40; // assigning value to the array 
    r.arr[4] = 50; // assigning value to the array
    System.out.println(r.get(0)); // getting the value at index 0   
}
    
    
}
