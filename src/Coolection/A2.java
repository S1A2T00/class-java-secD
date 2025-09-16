package Coolection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("Satyam");
        list.add(true);
        list.add(12.5);
        //list.remove(Integer.valueOf(10));
        list.removeAll(Collections.singleton(10));
        list.removeIf(Predicate.isEqual(10));
        list.removeIf(e->e.equals(10));
        
    }
}
