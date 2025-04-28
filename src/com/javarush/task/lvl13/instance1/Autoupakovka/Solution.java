package com.javarush.task.lvl13.instance1.Autoupakovka;

public class Solution {
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;

    private float floatValue;
    private double doubleValue;

    private char charValue;
    private boolean booleanValue;

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);
    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
