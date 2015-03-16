package com.units;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnitTest {

    @Test
    public void testOneFootIsEqualTo12Inches() {
        Measure oneFoot = new Length(1, Unit.FT);
        Measure twelveInches = new Length(12, Unit.IN);
        assertTrue(oneFoot.equals(twelveInches));
        assertTrue(twelveInches.equals(oneFoot));
    }

    @Test
    public void testEqualsReturnsFalseWhen1FootIsNotEqualTo10Inches() {
        Measure oneFoot = new Length(1, Unit.FT);
        Measure twelveInches = new Length(10, Unit.IN);
        assertFalse(oneFoot.equals(twelveInches));
        assertFalse(twelveInches.equals(oneFoot));
    }

    @Test
    public void test1GallonIsEqualTo3_78() {
        Measure oneGallon = new Volume(1.0,Unit.GALLON);
        Measure inLiters = new Volume(3.78,Unit.LITERS);
        assertTrue(oneGallon.equals(inLiters));
        assertTrue(inLiters.equals(oneGallon));
    }


    @Test
    public void test1_2GallonIsEqualTo4_53Liters (){
        Measure oneGallAnd2Gallon  = new Volume(1.2,Unit.GALLON);
        Measure fourAndHalfLiters = new Volume(4.53,Unit.LITERS);
        assertTrue(oneGallAnd2Gallon.equals(fourAndHalfLiters));
        assertTrue(fourAndHalfLiters.equals(oneGallAnd2Gallon));
    }
}
