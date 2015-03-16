package com.units;
import java.util.HashMap;
import java.util.Map;

public class Volume extends Measure {
    private static final Map<Unit, Double> unitFactors = new HashMap<Unit, Double>();

    static {
        unitFactors.put(Unit.GALLON, 3.78);
        unitFactors.put(Unit.LITERS, 1.0);
    }

    public Volume(double value, Unit unit) {
        super(value, unit, unitFactors);
    }
}