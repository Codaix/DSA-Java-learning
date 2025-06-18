package DAY10;
/*Generics:
 * 1. Generics is a feature in Java that allows us to create classes, 
 * interfaces, and methods with a placeholder for the type of data they operate on.
 * 2. helps to create a class which is generic in nature.
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
}
    
}
