package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinimumGap {

    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(7,1,3,4,1,7);
      //total O(2n) = On
        System.out.println("Minimum gap {7,1,3,4,1,7}: " + minimumGap(nums));
    }
    
    public static int minimumGap(List<Integer> list){
    	int maxValue = Collections.max(list); //On
    	int[] gapArr = new int[maxValue+1];
        int curMin = 0;
        int newMin = 0;
        for(int i = 0; i < list.size(); i++){ //On
        	if(gapArr[list.get(i)] != 0) {
                newMin = i - gapArr[list.get(i)];
                curMin = (newMin < curMin || curMin == 0) ? newMin : curMin;
                gapArr[list.get(i)] = i;
        	}
        	gapArr[list.get(i)] = i;
        }
        //total O(2n) = On
        return curMin;
    }
    
    public static int minimumGap2(List<Integer> list){
        ArrayList<Integer> gapArr = new ArrayList<Integer>();
        int curMin = 0;
        int newMin = 0;
        int gapArrIndex = 0;
       
        for(int i = 0; i < list.size(); i++){
            gapArrIndex = gapArr.indexOf(list.get(i));
            if(gapArrIndex != -1){
                newMin = i - gapArrIndex;
                curMin = (newMin < curMin || curMin == 0) ? newMin : curMin;
                gapArr.remove(gapArrIndex);
            }else{
                gapArr.add(i,list.get(i));
            }
           
        }
        return curMin;
    }    

}
