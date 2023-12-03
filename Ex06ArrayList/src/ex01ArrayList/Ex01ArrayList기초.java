package ex01ArrayList;

import java.util.ArrayList;

public class Ex01ArrayList기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList 선언 및 초기화
		
		ArrayList<String> name = new ArrayList<>();
		// Object : 상속
		// Object로 데이터를 받아서 String으로 자동 형반환 해줌
		// ex)< > 제네릭에 String, Integer, Float ... 레퍼런스형 변수만 들어갈 수 있음
		
		// 2. 데이터 추가하기
		// 1) add(데이터값)
		name.add("Joy");   // 인덱스[0]에 저장
		name.add("Kate");    // 인덱스[1]에 저장
		name.add("Tom");
		// 뒤로 붙어서 데이터가 저장됨
		
		// add(인덱스 값, 데이터 값)
		name.add(1, "Nara");     // 인덱스[1]에 Nara 데이터 넣어라
		// [1]인덱스에 Nara가 들어가고 기존 데이터는 뒤로 한칸씩 밀려 들어감
		
		// 3. 데이터 가져오기
		// get(index)
		name.get(1);    // 출력기능 X
		System.out.println(name.get(1));
		
		// ArrayList의 크기 : .size()
		for(int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i) + " ");
		}
		
		// 4. 데이터 삭제하기
		// 1) 선택해서 삭제 : remove(index)
		name.remove(2);
		System.out.println(name.size());  // 4 --> 3
		System.out.println(name.get(2));  // Tom
		
		// 2) 전체 삭제 : clear()
		name.clear();
		System.out.println(name.size());  // 0
	}

}
