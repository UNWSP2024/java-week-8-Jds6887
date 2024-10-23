package work5;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleDoubleQueueImplementation {
    public static void main(String[] args) {
        Queue queue1 = new LinkedList<>();
        Queue queue2 = new LinkedList<>();
        char let = 'A';
        int time = 0;
        int rn;
        

        String person = "" + let + let + let; 
        
        while (time < 40) {
            rn = (int)(Math.random() * 10); 
            
            
            if (rn < 4) { 
                if (queue1.size() <= queue2.size()) {
                    let++;
                    person = "" + let + let + let; 
                    queue1.add(person);
                } else {
                    let++;
                    person = "" + let + let + let;
                    queue2.add(person);
                }
            }
          
            if (rn >= 4 && rn < 8) {                 if (!queue1.isEmpty() && !queue2.isEmpty()) {
                    if (Math.random() < 0.5) {
                        queue1.poll(); 
                        queue2.poll(); 
                    }
                } else if (!queue1.isEmpty()) {
                    queue1.poll(); 
                } else if (!queue2.isEmpty()) {
                    queue2.poll(); 
                }
            }

            System.out.println("Time " + time + " : Queue 1: " + queue1 + ", Queue 2: " + queue2);
            time++;
        }
    }
}