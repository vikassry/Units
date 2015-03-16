package com.units;
import java.util.HashMap;
import java.util.Map;

public class Length {
    private double value;
    private Unit unit;
    private static final Map<Unit, Double> unitFactors = new HashMap<Unit, Double>();
    private final double PRECISION = 0.01;
    static {
        unitFactors.put(Unit.CM,1.0);
        unitFactors.put(Unit.IN,2.54);
        unitFactors.put(Unit.FT,30.48);
        unitFactors.put(Unit.MM,0.1);
    }

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        double diff = Math.abs(normalizeValue() - length.normalizeValue());
        return (diff <= PRECISION);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    private double normalizeValue () {
        return unitFactors.get(unit) * value;
    }
}
