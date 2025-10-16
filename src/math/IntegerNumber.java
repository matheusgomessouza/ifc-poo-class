package math;

public class IntegerNumber implements InterfaceComparable {
    private final int value;

    public IntegerNumber(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object comparable) {
        if (comparable == null) {
            throw new IllegalArgumentException("Argumento não pode ser nulo");
        }
        if (!(comparable instanceof IntegerNumber other)) {
            throw new IllegalArgumentException("Objeto deve ser do tipo IntegerNumber");
        }
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
