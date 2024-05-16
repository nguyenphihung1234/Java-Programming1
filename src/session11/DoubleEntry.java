package session11;

import session11.model.KeyValue;

public class DoubleEntry<V> extends KeyValue<Double,V> {
    public DoubleEntry(Double key, V value) {
        super(key, value);
    }

    public static void main(String[] args) {
        DoubleEntry<Double> entry = new DoubleEntry<Double>(0.6,0.5);
        Double sNumber = entry.getKey();
        Double sName = entry.getValue();
        System.out.println(sNumber + " " +sName);
    }
}
