package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SD_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Alison",31);
        hashMap.put("Lewin", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+ "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(10,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Alison",31);
        linkedHashMap.put("Lewin", 29);
        linkedHashMap.put("Cook",29);
        System.out.println("\n the age for "+ "Lewin is "+linkedHashMap.get("Lewin"));

    }
}
