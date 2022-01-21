package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 5, 2, 1, 7, 9, 3, 4};
        bubbleSort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean needNextPass = true;

//        for (int k = 1; k < arr.length && needNextPass; k++) {
//            /* Array may be sorted and next pass not needed */
//            needNextPass = false;
//            for (int i = 0; i < arr.length - k; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    /* Swap list[i] with list[i + 1] */
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                    needNextPass = true; /* Next pass still needed */
//                }
//            }
//        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
