package com.units;
import java.util.HashMap;
import java.util.Map;

public class Length extends Measure {
    private static final Map<Unit, Double> unitFactors = new HashMap<Unit, Double>();

    static {
        unitFactors.put(Unit.CM,1.0);
        unitFactors.put(Unit.IN,2.54);
        unitFactors.put(Unit.FT,30.48);
        unitFactors.put(Unit.MM,0.1);
    }

    public Length(double value, Unit unit) {
        super(value, unit, unitFactors);
    }
}
