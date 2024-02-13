import static org.junit.Assert.*;

import java.sql.Array;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    List<String> list1;
    List<String> list2;
    String SHOULD_BE_FIRST = "1";
    String SHOULD_BE_SECOND = "2";
    String SHOULD_BE_THIRD = "3";
    @Before
    public void setUp(){
        list1 = new ArrayList<String>();
        list2 = new ArrayList<String>();

        list1.add(SHOULD_BE_FIRST);
        list2.add(SHOULD_BE_SECOND);
        list1.add(SHOULD_BE_THIRD);
    }
    @Test
    public void testList(){
        List<String> list3 = ListExamples.merge(list1, list2);

        assertEquals(3, list3.size());
        

    }
}
