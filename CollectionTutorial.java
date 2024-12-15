import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTutorial { 
    public static void main(String[] args) {

        //list & ArrayList

       // List list= new ArrayList(); // if not species the generics then any value store , like int,string,float anything but when initialize
        // List<Integer> list= new ArrayList<>();  //proper Generics<Integer> then only int value store
        ArrayList<Integer> list= new ArrayList<>();  //And Always Write ArrayList , for good practice
        list.add(10);
        list.add(20);
        // list.add("manish");
        System.out.println(list);

        //linked list
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(13);
        // linkedList.add("manish");
        linkedList.add(1,22);
        linkedList.remove(0);
        System.out.println(linkedList);
      
        //vector

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(320);
        vector.add(310);
        System.out.println(vector);

        //stack , vector ko hi use karta hai
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        //set & Hashset

        Set <Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println("set="+set);

        //LinkedHashSet

        LinkedHashSet <Integer> llset = new LinkedHashSet<>();
        llset.add(10);
        llset.add(10);
        llset.add(5);
        llset.add(34);
        System.out.println("llset="+llset);
        llset.add(5);
        boolean bl= llset.contains(10);
        System.out.println(bl);
 
        //TreeSet //store in sorted , use binary search tree in backend
  
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(10);
        tset.add(44);
        tset.add(64);
        tset.add(4);

        tset.add(22);
        tset.add(44);
        System.out.println("tset="+tset);

       //Queue :: FIFO (first in first out)

       Queue<Integer> queue = new LinkedList<>();
       queue.add(10);
       queue.offer(20);
       queue.add(30);
       queue.offer(40);
       System.out.println("queue="+queue);
       System.out.println(queue.peek());
       System.out.println(queue.poll());
       System.out.println(queue.remove());
       System.out.println("queue="+queue);

       //ArrayDeque

       Deque<Integer> adq=new ArrayDeque<>();
       adq.offer(10);
       adq.offer(20);
       adq.offerLast(30);
    //    adq.poll();
    //    adq.pollFirst();
       adq.pollLast();
       adq.offerFirst(40);
       System.out.println("Dqueu = "+adq);

       //PriorityQueue By Default use MinHeap so value always Min on top of Pqueue
       PriorityQueue<Integer> pq= new PriorityQueue<>();
       pq.offer(10);
       pq.offer(2);
       pq.offer(12);
       pq.offer(4);
       pq.offer(1);
       System.out.println("Priority= "+pq);
    //    System.out.println("Min value="+pq.peek());
       pq.poll();
       System.out.println("second  Min value in Priority= "+pq.peek());
       System.out.println("Priority= "+pq);

         //PriorityQueue Now we use MaxHeap so value always Max on top of Pqueue
         PriorityQueue<Integer> pqMax= new PriorityQueue<>(Comparator.reverseOrder());
         pqMax.offer(10);
         pqMax.offer(2);
         pqMax.offer(12);
         pqMax.offer(4);
         pqMax.offer(1);
         System.out.println("Priority Max= "+pqMax);
         System.out.println("Max value="+pqMax.peek());
         System.out.println("Max Priority= "+pqMax);
         pqMax.poll();
         System.out.println("Second Largest value is :"+pqMax.peek());
      
         //Map 
         HashMap<String,Integer> map = new HashMap<>();

         map.put("first", 10);
         map.put("second", 20);
         map.put("third", 40);
         System.out.println("map= "+map);
       
         //TreeMap
         TreeMap<String,Integer> tmap= new TreeMap<>();
         tmap.put("first", 10);
         tmap.put("second", 20);
         tmap.put("third", 40);
         System.out.println("Tree map= "+tmap);
         System.out.println(tmap.get("first"));
         System.out.println(tmap.keySet());
         System.out.println(tmap.values());
         System.out.println(tmap.size());
         System.out.println(tmap.firstKey() );
       
         //practice

         int arr[]={1,2,44,5,66,7,8};
         for(int e:arr)
         System.out.print(e+",");
         Arrays.sort(arr);
         System.out.println();
         for(int e:arr)
         System.out.print(e+",");
          System.out.println();
         ArrayList<String> myList = new ArrayList<>();
         myList.add("Second");
         myList.add("First");
         myList.add("Third");
         System.out.println(myList);
         Collections.sort(myList);
         System.out.println(myList);
         System.out.println("Max= "+Collections.max(list));
         System.out.println(list);

         Iterator it = myList.iterator();
         while(it.hasNext())
         System.out.print(it.next()+", ");
    }
    
}
