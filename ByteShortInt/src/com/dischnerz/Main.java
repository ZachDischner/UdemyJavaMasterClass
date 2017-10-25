package com.dischnerz;

public class Main {

    public static void main(String[] args) {
        // Int: Width of 32 bits
        int myMinValue = Integer.MIN_VALUE; // -2147483648 ish
	    int myIntMaxValue =  2_147_483_647;       // A literal - Note Java 8 '_' syntax
        int intNumber = (myMinValue/2);
        System.out.println("Int number is: " + intNumber);

        // Byte: Width of 8 bits
        byte myMinByteValue = -128;
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myNewByteValue = (byte) (myMinByteValue/2);  // Note - Java by default tries to convert this into an int by default
                                                    // unless you explicitly cast it

        // Short: Width of 16 bits
        short myShortMinValue = -32_767;
        short myShortMaxValue = Short.MAX_VALUE;

        // Long: Width of 64
        long myMinLongValue = Long.MIN_VALUE;  // 2^63
        long MyLongMaxValue = 9_223_372_036_854_775_807L; // NOTE! Need the 'L' tacked on

        long someLongNumber = 50000L + 10L*((long) myMaxByteValue + myShortMaxValue + myIntMaxValue);
        System.out.println("Super sum: " + someLongNumber);

    }
}
