package com.codegnan.dsa ;
import java.util.*;
public class FrequencyNum{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 1, 3};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}