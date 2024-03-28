import java.util.*;
public class haspmap 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        //insertion
        map.put("india",140);
        map.put("usa",50);
        map.put("china",160);

        System.out.println(map);
        // output {usa=50, china=160, india=140}

        //modify
        map.put("china", 200);
        System.out.println(map);

        //searching
        if(map.containsKey("indio"))
        {
            System.out.println("it exists");
        }else
        {
            System.out.println("does not exists");
        }

    }    
}
