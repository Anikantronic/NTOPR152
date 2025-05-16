import java.util.*;

public class Mense {

    public static void main(String[] args) {
        

        ArrayList<Integer> ouderdomme = new ArrayList<Integer>();

        ouderdomme.add(25);
        vertoon(ouderdomme);
        ouderdomme.add(30);
        vertoon(ouderdomme);
        ouderdomme.add(18);
        vertoon(ouderdomme);
        ouderdomme.add(55);
        vertoon(ouderdomme);
        ouderdomme.add(78);
        vertoon(ouderdomme);
        ouderdomme.add(50);
        vertoon(ouderdomme);
        
        ouderdomme.add(3, 38);
        vertoon(ouderdomme);

        ouderdomme.remove(2);
        vertoon(ouderdomme);

        ouderdomme.addFirst(32);
        vertoon(ouderdomme);

        System.out.println();
        if(ouderdomme.indexOf(50) != -1){
            System.out.println("50 is in die lys.");
            vertoon(ouderdomme);
        } else {
            System.out.println("50 is nie in die lys nie!");
        }

        System.out.println();
        System.out.println("Die index van 78 is: "+ouderdomme.indexOf(78));

        ouderdomme.clear();
        if(ouderdomme.size() == 0){
            System.out.println("Die lys is leeg.");
        } else {
            System.out.println("Die lys is nie leeg nie!");
        }

    }

    public static void vertoon(ArrayList<Integer> ouderdomme){
        
        System.out.println();
        System.out.println("Hierop volg die lys:");
        for(int i=0; i<ouderdomme.size(); i++){
            System.out.println(ouderdomme.get(i));
        }
    }
    
}
