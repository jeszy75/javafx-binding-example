package ex2;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.printf("Usage: java %s <number> <number> <number>\n", Main.class.getName());
            System.exit(1);
        }
        DoubleProperty a = new SimpleDoubleProperty();
        DoubleProperty b = new SimpleDoubleProperty();
        DoubleProperty c = new SimpleDoubleProperty();
        BooleanBinding result = a.multiply(a).add(b.multiply(b)).isEqualTo(c.multiply(c));
        a.set(Integer.parseInt(args[0]));
        b.set(Integer.parseInt(args[1]));
        c.set(Integer.parseInt(args[2]));
        System.out.println(result.get());
    }

}
