package DAY11;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> lhm = new java.util.LinkedHashMap<>();
        lhm.put("one", 1);
        lhm.put("two", 2);
        lhm.put("three", 3);
        
        System.out.println(lhm.get("two"));
        if (lhm.containsKey("one")) {
            System.out.println("yes");
        }
        
        for (String e : lhm.keySet()) {
            System.out.println("the key is: " + e + " and the value is: " + lhm.get(e));
        }
        
        lhm.remove("one");
        System.out.println(lhm);
    }
    
}
