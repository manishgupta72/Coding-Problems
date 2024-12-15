import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> Sname =new ArrayList<>();

        Sname.add("manish");
        System.out.println(Sname);
        Sname.add("suraj");
        Sname.add("sumit");
        System.out.println(Sname);

        List<Integer> list = new ArrayList();
    //     list.add(1);
    //     list.add(3);
    //     System.out.println(list);
    //     List<Integer> newlist= new ArrayList<>();
    //     newlist.add(140);
    //     newlist.add(399);
    //     System.out.println(newlist);
    //     list.addAll(newlist);
    //     System.out.println(list);
    //     list.remove(2);
    // System.out.println(list.get(2));
    // list.remove(Integer.valueOf(399));
    // list.set(1,99999);
    
    // System.out.println(list.contains(1)); 
    // System.out.println(list);
        
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    for(Integer element:list)
    {
        System.out.println("number is ="+element);
    }
      
    Iterator<Integer> it = list.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }

    } 
}
