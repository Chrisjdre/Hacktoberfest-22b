package codingbat;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] result = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
    
    @Test
    void mohmeed_firstSwap() {
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void marwa_fistSwap() {
      // firstSwap(["ab", "ac"]) → ["ac", "ab"]
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertTrue(Arrays.toString(expected).equals( Arrays.toString(result)));

    }

    // Test for wordLen()
    @Test
    void teft_wordLen() {
        String[] strings1 = {"one", "two", "one", "three", "two", "one"};
        Map<String, Integer> methodmap = Map2.wordLen(strings1);
        assertEquals(3, methodmap.get("one"));
        assertEquals(3, methodmap.get("two"));
        assertEquals(5, methodmap.get("three"));

        String[] strings2 = {"a", "two", "a", "two", "be", "be"};
        Map<String, Integer> methodmap2 = Map2.wordLen(strings2);
        assertEquals(1, methodmap2.get("a"));
        assertEquals(3, methodmap2.get("two"));
        assertEquals(2, methodmap2.get("be"));
    }

    @Test
    void alex_word0() {
        String[] strings = {"apple"};
        String result = Map2.word0(strings).toString();
        assertEquals(result, "{apple=0}");
    }

    @Test
    void hoang_wordCount() {
        //Good test
        String[] strings = {"cat", "dog", "cat", "fish", "rabbit", "rabbit", "rabbit", "bird"};
        Map<String, Integer> map = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat", 2);
        expected.put("dog", 1);
        expected.put("fish", 1);
        expected.put("rabbit", 3);
        expected.put("bird", 1);
        assertTrue(expected.equals(map));


        //Bad test
        Map<String, Integer> map2 = Map2.wordCount(strings);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("cat", 2);
        expected2.put("dog", 1);
        expected2.put("fish", 1);
        expected2.put("rabbit", 7);
        assertFalse(expected2.equals(map2));
    }

}
