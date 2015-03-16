package com.units;

import java.util.HashMap;
import java.util.Map;

public class Measure {
    private double value;
    private Unit unit;
    private final double PRECISION = 0.01;
    private Map<Unit, Double> unitFactors = new HashMap<Unit, Double>();

    public Measure(double value, Unit unit, Map<Unit, Double> unitFactors) {
        this.value = value;
        this.unit = unit;
        this.unitFactors = unitFactors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measure measure = (Measure) o;
        double diff = Math.abs(normalizeValue() - measure.normalizeValue());
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