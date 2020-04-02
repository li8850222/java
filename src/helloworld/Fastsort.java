package helloworld;

import java.util.Arrays;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/22 1:39 下午
 */
public class Fastsort {
    public static void main(String[] args) {
        int[] newone = {78,5,7,9,287,64,34,19,234,45745,2342,546,142,98,2};
        int[] result = fastsort(newone);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] fastsort(int[] list){
        int low = 0;
        int high = list.length-1;
        int temp = list[low];
        while(low<high){
            while(low < high && list[low] <= list[high]){
                high--;
            }
            list[low]=list[high];
            list[high]=temp;
            while (low < high && list[low] <= list[high]){
                low++;
            }
            list[high]=list[low];
            list[low]=temp;
        }
        int[] left = Arrays.copyOfRange(list,0,low+1);
        if (left.length>1){
            left = fastsort(left);
        }
        int[] right = Arrays.copyOfRange(list,low+1,list.length);
        if (right.length>1){
            right = fastsort(right);
        }
        int[] result = new int[left.length+right.length];
        for(int i=0;i<left.length;i++){
            result[i]=left[i];
        }
        for(int i=0;i<right.length;i++){
            result[left.length+i]=right[i];
        }
        return result;
    }
}
