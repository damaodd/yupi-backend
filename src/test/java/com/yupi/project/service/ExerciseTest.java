package com.yupi.project.service;

import org.junit.jupiter.api.Test;

import java.util.*;

import java.util.Scanner;

    public class ExerciseTest {

        public  static void main(String[] args) {
            // 创建长度为100的整数数组
            int[] array = new int[100];

            // 随机生成整数并填充数组
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(1000); // 生成范围在0到999之间的随机整数
            }
            // 输出原始数组
            System.out.println("原始数组：" + Arrays.toString(array));
            // 使用冒泡排序进行升序排序
            bubbleSort(array);
            // 输出排序后的数组
            System.out.println("升序排序后的数组：" + Arrays.toString(array));
        }

        // 冒泡排序算法
        private static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // 交换 array[j] 和 array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }


    }


