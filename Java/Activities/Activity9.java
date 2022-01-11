package activities;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Rose");
        myList.add("Lily");
        myList.add("Marigold");
        //Adding object at specific index
        myList.add(2,"Sunflower");
        myList.add(3,"Lotus");

        for(String fName:myList){
            System.out.println(fName);
        }
        System.out.println("Third name is: "+myList.get(2));
        System.out.println("Is jasmine in the list? "+ myList.contains("Jasmine"));
        System.out.println("Is lily in the list? "+ myList.contains("Lily"));

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Name "+(i+1)+": "+myList.get(i));

        }

        System.out.println("Size before removal: "+myList.size());

        //remove Lily
        myList.remove(1);

        //New size after removal
        System.out.println("Size after removal: "+myList.size());
    }


}
