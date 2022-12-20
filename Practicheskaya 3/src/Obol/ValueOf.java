package Obol;

public class ValueOf {
        public static void main(String[] args)
        {
            Double c= Double.valueOf(4);
            System.out.println(c.doubleValue());
            System.out.println(c.floatValue());
            System.out.println(c.intValue());
            System.out.println(c.shortValue());
            System.out.println(c.byteValue());
            System.out.println(c.longValue());
        }
}
