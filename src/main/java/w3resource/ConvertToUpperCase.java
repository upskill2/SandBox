package w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUpperCase {

    public List<String> upperCase(List<String> list) {

       list = Arrays.asList(new String[]{"s", "t", "r"});

   return list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        System.out.println(new ConvertToUpperCase().upperCase(new ArrayList<>()));
    }

}
