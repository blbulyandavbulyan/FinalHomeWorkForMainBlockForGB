package org.blbulyandavbulyan.finalhomework;

import static org.blbulyandavbulyan.finalhomework.StringArrayTransformer.transformArrayByLength;

public class Main {
    public static void main(String[] args) {
        String[] array = InputOutputStringArray.readStringArray();
        InputOutputStringArray.printStringArray(transformArrayByLength(array, 3));
    }

}
