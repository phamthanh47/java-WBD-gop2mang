package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner  scanner=new Scanner(System.in);
    public static void main(String[] args) {
          float[] a=null;
          float[] b=null;
          float[] c=null;
        a=input(a);
        b=input(b);
        c=merge(a,b);
        sortASC(c);
        show(c);
        System.out.println("\n");
        sortDESC(c);
        show(c);
    }
    public static float[] input(float[] arr){
        System.out.print("nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        arr=new float[n];
        System.out.print("nhap cac phan tu cua mang: ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]= ",i);
            arr[i]=scanner.nextFloat();
        }
        return arr;
    }
    public static void sortASC(float[] arr){
        float temp=arr[0];
        for(int i =0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void sortDESC(float[] arr){
        float temp = arr[0];
        for(int i =0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static float[] merge(float[] a, float[] b){
        int aIndex=a.length-1;
        int bIndex=b.length-1;
        int cIndex=(a.length+b.length-1);
        float[] c=new float[cIndex+1];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int j=a.length;j<c.length;j++){
            c[j]=b[j-a.length];
        }
        return c;
    }
    public static void show(float[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
