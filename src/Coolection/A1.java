package Coolection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class A1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("Satyam");
        list.add(true);
        list.add(12.5);
        ArrayList list1=new ArrayList();
        list1.add(11);
        list1.add(0, 120);
        list1.add(list);
        System.out.println(list1);
        for(Object i:list){
            System.out.println(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
