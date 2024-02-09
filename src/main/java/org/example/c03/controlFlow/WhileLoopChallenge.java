package org.example.c03.controlFlow;

public class WhileLoopChallenge {
    public static boolean isEven(int number) {
        if (number < 0) {
            return false;
        } else return number % 2 == 0;
    }
    public static int[] storeEven(int start, int end) {
        int count=0;
        int[] temporaryArray=new int[end-start+1];
        int i=start;
            while ( i <= end) {
                if (isEven(i)) {
                    temporaryArray[count]=i;
                    count++;
                }
                i++;
            }
            int[] resultArray=new int[count];
        int j=0;
            while(j<count){
                resultArray[j]=temporaryArray[j];
                j++;
            }
        return resultArray;
    }
}
