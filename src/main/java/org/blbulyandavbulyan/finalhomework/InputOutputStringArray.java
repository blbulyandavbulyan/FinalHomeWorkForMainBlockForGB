package org.blbulyandavbulyan.finalhomework;

import java.util.Scanner;

public class InputOutputStringArray {
    String [] array;
    public InputOutputStringArray(){
    }
    public static String[] readStringArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Введите %d элемент массива: ", i + 1);
            array[i] = scanner.nextLine();
        }
        return array;
    }
    public static void printStringArray(String []array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%s ", array[i]);
        }
        System.out.println();
    }
    public String[] getArray() {
        return array;
    }
}
