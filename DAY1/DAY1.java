package DAY1;
//in java strings are literals and it can be mutated.


public class DAY1 {
    // methods: helps in reusabilty, readabilty and mentainability.
    int min(int x, int y){
        //two types of methods: build-in and user defined

        return min(x, min(y,x));
        // its ussed in real case when we need to use multiple api's..
        // instead we can use method overloading.
    }
    //method overloading; help us to create methods with same method
    //sign but different no. of args or different type of args.
    public static void main(String[] args) {
    String str = "World";
    String str2 = /*new String*/ ("World");
    if(str.equalsIgnoreCase(str2)){
        System.out.println("same");
    } 
    else{
        System.out.println("not same");
    }
    // this gives false because new keywork gives a different memory address to the str2
    }
}

