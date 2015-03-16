package com.units;

public class Inch {
    private double value;

    public Inch(double value) {
        this.value=value;
    }

    public static Inch create(double value){
        return new Inch(value);
    }

    public Foot toFoot() {
        return Foot.create(value/12);
    }
}
