package day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumGap {

	public static void main(String args[]) {
		List<Integer> nums = Arrays.asList(7,1,3,4,1,7,9,7,8,7);
		// total O(2n) = On
		System.out.println("Minimum gap {7,1,3,4,1,7,7,8,7}: " + minimumGap(nums));
	}

	public static int minimumGap(List<Integer> list) {
		Map<Integer, Integer> occurenceMap = new HashMap<Integer, Integer>();
		int curMin = 0;
		int newMin = 0;
		for (int i = 0; i < list.size(); i++) { // On
			if (occurenceMap.containsKey(list.get(i))) {
				newMin = i - occurenceMap.get(list.get(i));
				curMin = (newMin < curMin || curMin == 0) ? newMin : curMin;
			}
			occurenceMap.put(list.get(i), i);
		}
		// total O(2n) = On
		return curMin;
	}

//    public static int minimumGap2(List<Integer> list){
//        ArrayList<Integer> gapArr = new ArrayList<Integer>();
//        int curMin = 0;
//        int newMin = 0;
//        int gapArrIndex = 0;
//       
//        for(int i = 0; i < list.size(); i++){
//            gapArrIndex = gapArr.indexOf(list.get(i));
//            if(gapArrIndex != -1){
//                newMin = i - gapArrIndex;
//                curMin = (newMin < curMin || curMin == 0) ? newMin : curMin;
//                gapArr.remove(gapArrIndex);
//            }else{
//                gapArr.add(i,list.get(i));
//            }
//           
//        }
//        return curMin;
//    }    

}
