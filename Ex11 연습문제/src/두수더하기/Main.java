package 두수더하기;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {2,3,1,2,1};
		ArrayList<Integer> arr = new ArrayList<>();
		int cnt = 1;
		 for(int i = 0; i < numbers.length; i++){
	            for(int j = cnt; j <numbers.length; j++){
	              arr.add(numbers[i]+numbers[j]);
	            }
	            cnt++;
	        }
		 
		 for(int i = 0; i < arr.size(); i++) {
			 System.out.print(arr.get(i) + " ");
		 }
		 System.out.println();
		 
		 int [] answer = new int[arr.size()];
		 
//		 for (int i = 0; i < dataList.size(); i++) {
//             if (!resultList.contains(dataList.get(i))) {
//                 resultList.add(dataList.get(i));
//             }
//         }
		 
		 for(int i = 0; i < arr.size(); i ++) {
			 answer[i] = arr.get(i);
			 for(int j = 0 ; j < i; j++) {
				 if(arr.get(j) == answer[i]) {
					 i--;
					 break;
				 }
			 }

		 }
		 
		 for(int i = 0; i < answer.length; i++) {
			 System.out.print(answer[i] + " ");
		 }
	}

}
