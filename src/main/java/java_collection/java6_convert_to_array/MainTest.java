package java_collection.java6_convert_to_array;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<String> itemList = new ArrayList<String>();
        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");

        String[] itemsArray = new String[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);

        for(String s : itemsArray)
            System.out.println(s);
    }

}
