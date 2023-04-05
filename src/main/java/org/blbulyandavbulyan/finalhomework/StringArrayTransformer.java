package org.blbulyandavbulyan.finalhomework;

public class StringArrayTransformer {
    //эта функция по сути и является решением задачи
    public static String[] transformArrayByLength(String[] array, int maxStringLength){
        String[] result = null;
        int newArrayLength = 0;
        //цикл для подсчёта длинны нового массива
        for(int i = 0; i < array.length; i++){
            if(array[i].length() <= maxStringLength)newArrayLength++;
        }
        result = new String[newArrayLength];
        for(int i = 0, ni = 0; i < array.length; i++){
            if(array[i].length() <= maxStringLength){
                result[ni++] = array[i];
            }
        }
        return result;
    }
}
