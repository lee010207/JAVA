package 콜라문제;

public class Solution {
 
        
        public int solution(String[] order) {
            int answer = 0;
            for(int i = 0; i < order.length; i++){
                if(order[i].equals("iceamericano")||order[i].equals("americanoice")||order[i].equals("hotamericano")||order[i].equals("americanohot")||order[i].equals("anything")||order[i].equals("americano"))
                {
                    answer += 4500;
                }else{
                    answer += 5000;
                }
            }    
            return answer;
        
        
        }
    
}
//20/7 -> 2...6 ->2+6 /7 -> 1...1
//elif(order[i].equals("icecafelatte")||order[i].equals("cafelatteice")||order[i].equals("hotcafelatte")||order[i].equals("cafelattehot")||order[i].equals("cafelatte")){