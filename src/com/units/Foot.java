package com.units;

public class Foot {
    private double value;

    public Foot(Double value) {
        this.value=value;
    }

    public static Foot create(double value) {
        return new Foot(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foot foot = (Foot) o;
        Double difference = Math.abs(foot.value - value);
        return difference < 0.001;
    }

    public boolean equals(Inch in) {
        return equals(in.toFoot());
}
}