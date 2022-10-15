import java.util.Map;
import java.util.HashMap;
public class Learning{
    public static void main(String[] args){

        Map<Integer , String> map = new HashMap<>();

        //insert
        map.put(1,"Alok");
        map.put(2,"Aarti");
        map.put(3,"gauri"); 
        
        //removing 
        map.remove(1);


        //iterating
        for(var item : map.keySet()){
            System.out.println(item);
        }

        for(var item : map.entrySet()){
            System.out.println(item);
        }


    }
}