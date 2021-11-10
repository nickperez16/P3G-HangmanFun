import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        //Add element
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //Return the first element and delete it in delete
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //Return the first element
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //Return the first element
        for(String q : queue){
            System.out.println(q);
        }
    }
}


