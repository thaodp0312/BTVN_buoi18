import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test thôi mà");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "name1", "address1"));
        customers.add(new Customer(2, "name2", "address1"));
        customers.add(new Customer(3, "name3", "address2"));
        customers.add(new Customer(4, "name4", "address2"));
        customers.add(new Customer(5, "name5", "address3"));
        customers.add(new Customer(6, "name6", "address3"));
        System.out.println(customers);
        System.out.println("************* key = id, value = customer ************");
        Map<Integer, Customer> map1 = customers.stream()
                .collect(Collectors.toMap(Customer::getId,Function.identity()));


        map1.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));

        System.out.println("************* key = id, value = name ************");
     Map<String,Customer> map2 = customers.stream()
             . collect(Collectors.toMap(Customer::getName,Function.identity()));
        map2.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));
    }


    }

