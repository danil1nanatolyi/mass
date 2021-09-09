package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[]{2, 5, 2, 8, 5, 6, 8, 8};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (Integer m : arr){
            System.out.print(m + " ");
        }
        System.out.println();
    }
}


