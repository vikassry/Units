package com.units;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MeasureTest {
    private Map<Unit, Double> conversionMap;
    @Before
    public void setUp(){
        conversionMap = new HashMap<Unit, Double>();
        conversionMap.put(Unit.CM,1.0);
        conversionMap.put(Unit.IN,2.54);
        conversionMap.put(Unit.FT,30.48);
        conversionMap.put(Unit.MM, 0.1);
    }

    @Test
    public void unitEqualsReturnsFalseNonEquivalentDataAreGiven(){
        Length inch = new Length(12.0,Unit.IN);
        Length foot = new Length(1.0,Unit.FT);
        assertTrue(inch.equals(foot));
    }

    @Test
    public void equalsReturnsTrueWhenCentimeterIsPassed(){
        Length actualCm = new Length(1.0,Unit.CM);
        Length expectedCm = new Length(1.0,Unit.CM);
        assertTrue(actualCm.equals(expectedCm));
    }

    @Test
    public void getCentimeterReturnsACentimeterWithSameValueWhenTheUnitIsCm(){
        Length actualCm = new Length(1.0,Unit.CM);
        Length expectedCm = new Length(1.0,Unit.CM);
        assertTrue(actualCm.equals(expectedCm));
    }


    @Test
    public void test1CentimeterEqualsTo10Millimeter (){
        Length actualInCm = new Length(1,Unit.CM);
        Length expectedInMM = new Length(10,Unit.MM);
        assertTrue(actualInCm.equals(expectedInMM));
    }

    @Test
    public void test1GallonIsEqualTo3_78Litres() {
        Volume oneGallon = new Volume(1.0,Unit.GALLON);
        Volume threeLiters = new Volume(3.78,Unit.LITERS);
        assertTrue(oneGallon.equals(threeLiters));
        assertTrue(threeLiters.equals(oneGallon));
    }

    @Test
    public void test1GallonIsNotEqualTo3Litres() {
        Volume oneGallon = new Volume(1.0,Unit.GALLON);
        Volume threeLiters = new Volume(3.0,Unit.LITERS);
        assertFalse(oneGallon.equals(threeLiters));
        assertFalse(threeLiters.equals(oneGallon));
    }
    
    @Test
    public void test1_2GallonIsEqualTo4_53Liters (){
        Volume oneGallAnd2Gallon  = new Volume(1.2,Unit.GALLON);
        Volume fourAndHalfLiters = new Volume(4.53,Unit.LITERS);
        assertTrue(oneGallAnd2Gallon.equals(fourAndHalfLiters));
        assertTrue(fourAndHalfLiters.equals(oneGallAnd2Gallon));
    }
}