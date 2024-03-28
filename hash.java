import java.util.HashSet;
import java.util.Iterator;;
public class hash 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        
        if(set.contains(1))
        {
            System.out.println("set contains 1");
        }

        //delete
        set.remove(2);
        if(!set.contains(2))
        {
            System.out.println("2 does not exists");
        }

        //size
        System.out.println(set.size());

        //print all elements
        System.out.println(set);


        //Iterator in hashset
        Iterator it = set.iterator();
        //hasnext()= checks if elements exits and returns true until find elements
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }    
}
