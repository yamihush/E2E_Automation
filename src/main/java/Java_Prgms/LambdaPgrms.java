package Java_Prgms;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPgrms {

    @Test
    public void lamdatest(){

        ArrayList<String> al = new ArrayList<String>();
        al.add("Amaran");
        al.add("Bhvana");
        al.add("Chnadran");
        al.add("divya");
        al.add("Madhu");
        al.add("Bhanu");
        al.add("chanra");
        al.add("dritnhadfa asdf");

        // Count no of items
        System.out.println(al.stream().count());

        // Print sorted list
        al.stream().sorted().forEach(s -> System.out.println(s));

        // String Matcher
        System.out.println(al.stream().anyMatch(s -> s == "shanu"));

        //

        List<Integer> numbers = Arrays.asList(1,3,2,2,3,4,5,6,7,8,5,4,4,33,44,44);

        System.out.println(numbers.stream().distinct().sorted().count());

        numbers.stream().distinct().forEach(s-> System.out.println(s));

        List<Integer> li = numbers.stream().sorted().distinct().collect(Collectors.toList());

        System.out.println(li.get(2));
    }


}
