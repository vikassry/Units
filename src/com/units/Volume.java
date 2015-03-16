package com.units;
import java.util.HashMap;
import java.util.Map;

public class Volume {
    private double value;
    private Unit unit;
    private static final Map<Unit, Double> unitValues = new HashMap<Unit, Double>();
    private final double PRECISION = 0.01;
    static {
        unitValues.put(Unit.GALLON, 3.78);
        unitValues.put(Unit.LITERS, 1.0);
    }

    public Volume(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        double diff = Math.abs(normalizeValue() - volume.normalizeValue());
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
        return unitValues.get(unit) * value;
    }
}