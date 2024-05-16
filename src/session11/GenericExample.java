package session11;

import session11.model.KeyValue;

public class GenericExample {
    public static void main(String[] args) {
        KeyValue<Integer,String > entry = new KeyValue<Integer,String>(012345,"Hung");
        //K:Integer
        Integer phone = entry.getKey();
        //V:Value String
        String name = entry.getValue();
        System.out.println(phone +" " +name);
    }
}
