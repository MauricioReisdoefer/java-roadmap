class NumericOperation<T extends Number>{ // ONLY NUMBERS
    T internalValue;
    public NumericOperation(T value)
    {
        this.internalValue = value;
    }
    public Double returnDoubleDouble()
    {
        return this.internalValue.doubleValue() * 2.0;
    }
}

public class BoundsJava{
    public static void main(String[] args) {
        NumericOperation<Integer> number = new NumericOperation<>(14);
        System.out.println("Number Double: " + number.returnDoubleDouble());
    }
}