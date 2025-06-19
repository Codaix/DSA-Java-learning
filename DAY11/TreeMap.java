package DAY11;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> tm = new java.util.TreeMap<>();
        tm.put("one", 1);
        tm.put("two", 2);
        tm.put("three", 3);
        
        System.out.println(tm.get("two"));
        if (tm.containsKey("one")) {
            System.out.println("yes");
        }
        
        for (String e : tm.keySet()) {
            System.out.println("the key is: " + e + " and the value is: " + tm.get(e));
        }
        
        tm.remove("one");
        System.out.println(tm);
    }
    
}
