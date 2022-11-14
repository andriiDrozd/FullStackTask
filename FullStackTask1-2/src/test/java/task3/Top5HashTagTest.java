package task3;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class Top5HashTagTest {

    @Test
    void find() {
        String string1 = "#1 #1 h #2 fg #3 #41 h #1 #2 #5";
        String string2 = "gfh #4 gfh #3 #2 #41 gd gh #5 #2";
        String string3 = "#3 3 #3 #4 fgd #41 #5 dgh";
        String string4 = "#4 dggfger #41 #5 #4";
        String string5="#4 #5";

        List<String> list = new ArrayList<>(List.of(string1, string2, string3, string4, string5));
        Top5HashTag top5HashTag=new Top5HashTag();
        top5HashTag.find(list);
        assertEquals("[#5=5, #41=4, #4=4, #3=3, #2=2]",top5HashTag.find(list));
    }

    @Test
    void find2() {
        String string1 = "#1 #1 h #1 fg #1 #1 h #1 #1 #1";
        String string3 = "#3 3 #3 #3 fgd #3 #3 dgh";
        String string4 = "#4 dggfger #3 #3 #3";
        String string5="#3 #3 ";

        List<String> list = new ArrayList<>(List.of(string1, string3, string4, string5));
        Top5HashTag top5HashTag=new Top5HashTag();
        top5HashTag.find(list);
        assertEquals("[#3=3, #4=1, #1=1]",top5HashTag.find(list));
    }
}