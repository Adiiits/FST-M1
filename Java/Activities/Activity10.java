package activities;

import java.util.ArrayList;

public class Activity10 {

    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();
        hs.add("Rose");
        hs.add("Lily");
        hs.add("Marigold");
        hs.add("Hibiscus");
        //Adding object at specific index
        hs.add(2,"Sunflower");
        hs.add(3,"Lotus");

        System.out.println("Size of hs: "+hs.size());
        for(String fName:hs){
            System.out.println(fName);
        }
        System.out.println("Third name before removal: "+hs.get(2));

        //remove Lily
        hs.remove(2);

        //New size after removal
        System.out.println("Size after removal: "+hs.size());
        if(hs.remove("Jasmine")){
            System.out.println("Jasmine removed from set.");
        }else
            System.out.println("Jasmine not found in the set.");

        System.out.println("Third name after removal: "+hs.get(2));
        System.out.println("Is jasmine in the list? "+ hs.contains("Jasmine"));
        System.out.println("Is lily in the list? "+ hs.contains("Lily"));

        for (int i = 0; i < hs.size(); i++) {
            System.out.println("Name "+(i+1)+": "+hs.get(i));}

    }

}
