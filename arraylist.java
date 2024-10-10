
import java.util.*;

class arraylist {
    public static void main(String args[]) {

        ArrayList al = new ArrayList(); // creating array list
        al.add("kmit"); // adding elements
        al.add("Kmec");
        al.add("501");
        al.add("kmit");
        System.out.println(al);
        al.set(1, "NGIT");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.indexOf("501"));
        System.out.println(al);
        al.remove("kmit");
        System.out.println(al);
        System.out.println(al.lastIndexOf("kmit"));
        System.out.println(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}