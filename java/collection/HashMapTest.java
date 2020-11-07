package collection;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null,null);

        HashSet set = new HashSet();
        set.add(null);

        TreeMap treeMap = new TreeMap();
        treeMap.put("","");

        Hashtable hashtable = new Hashtable();
        hashtable.put("null","null");

        LinkedHashMap linkedHashMap = new LinkedHashMap();

        ArrayList list = new ArrayList();
        list.add("");

        String s1 = new StringBuilder("go")
                .append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja")
                .append("va").toString();
        System.out.println(s2.intern() == s2);

    }
}
