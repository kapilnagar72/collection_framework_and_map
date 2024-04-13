package collection_framework_and_map;

import java.util.ArrayList;
public class TestJavaCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kaplu");
        list.add("kapil");
        list.add("vaibhav");
        list.add("ankit");
        java.util.Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    
}
