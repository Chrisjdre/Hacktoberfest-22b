package codingbat;

import codingbat.Map1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void marc_mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertFalse(map2.containsKey("a"));
        assertFalse(map2.containsKey("b"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "cat");
        map3.put("b", "dog");
        Map<String, String> map4 = Map1.mapAB2(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("b"));

    }

    @Test
    void ethank_topping2(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "cat");
        map2.put("b", "cat");
        Map1.topping2(map1);
        assertEquals(map1, map2);


        map1.put("ice cream", "");
        assertFalse(map1.containsKey("yogurt"));
        Map1.topping2(map1);
        assertFalse(map1.containsKey("yogurt"));

        map1.put("ice cream", "42");
        Map1.topping2(map1);
        assertTrue(map1.containsKey("yogurt"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("spinach","rats");
        Map1.topping2(map3);
        assertEquals(map3.get("spinach") , "nuts");

    }

}