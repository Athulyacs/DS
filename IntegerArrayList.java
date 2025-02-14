import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList();
        array.add(10);
        array.add(20);
        array.add(28);
        array.add(2,25);
        array.remove(3);
        array.remove(Integer.valueOf(25));
        
        System.out.println(array.contains(26));
        array.remove(Integer.valueOf(26));
        if(array.contains(26)){
            array.remove(Integer.valueOf(26));
            
        }else{
            
            
        }
    
        
        for(int num: array){
            System.out.println(num);
        }
        System.out.println();
        System.out.println(array.get(1));

        
        
        
        
        
        
    }
}
