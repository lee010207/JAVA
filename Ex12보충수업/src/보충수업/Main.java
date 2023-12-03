package 보충수업;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 안에 메서드를 쓰고 싶으면 "객체생성"을 해야함
		// 클래스도 자료형임!!
		
		// PBK짜장면 본점
		// PBKJajangmyeon pbk = new PBKJajangmyeon();
		// 추상 클래스는 객체 생성 못함
		
		
		// 각각 오버라이딩된 분점 클래스별 각자의 기능으로 구현됨
		// PCH짜장면 분점1
		PCHJajangmyeon pch = new PCHJajangmyeon();
		// PBKJajangmyeon 상속받음 --> PCHJajangmyeon 
		// 부모 클래스 PBKJajangmyeon 메서드 쓸 수 있음
	
		
		// PBG짜장면 분점2
		PBGJajangmyeon pbg = new PBGJajangmyeon();
		
		
		// PJG짜장면 분점3
		PJGJajangmyeon pjg = new PJGJajangmyeon();
		
		// PDY짜장면 분점4
		PDYJajangmyeon pdy = new PDYJajangmyeon();
		
		// 업캐스팅
		// 추상 클래스도 업캐스팅 가능!
		PBKJajangmyeon p1 = pch;
		// 서로 상속 관계이여야만 캐스팅(형변환)이 가능함
		// 자식 클래스 PCH 데이터타입인 pch를 --> 부모 클래스 PBK 데이터타입으로 바꿔줌
		
		p1.makeJajang();  // --> 30년 전통! 짜장면 위에 민트초코 톡
		// 부모클래스가 된 자식객체는 자식 클래스에서 확장된 메서드는 사용 불가
		// 자식클래스에서 오버라이딩된 메서드는 실행 됨!!
		// --> .makeGoonManDo(); 사용 X
		// --> .makeJajang(); : 자식에서 재정의된 기능으로 구현!!
		
		PBKJajangmyeon p2 = pbg;
		PBKJajangmyeon p3 = pjg;
		PBKJajangmyeon p4 = pdy;
		
		// 이거 왜해? : 데이터를 효과적으로 관리하기 위해서
		// --> 업캐스팅하면 데이터타입이 같아짐 : PBKJajangmyeon
		// 부모클래스 타입으로 자식들을 하나로 묶어줄 수 있음
		// --> ArrayList에 담아줄 수 있어 원래는 각각 데이터 타입이 다른 객체를
		
		ArrayList<PBKJajangmyeon> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).makeJajang();
		}
		
		// 다운캐스팅((자식 -> 부모(업캐스팅)) -> 자식)
		PCHJajangmyeon pch2 = (PCHJajangmyeon)p1;
		pch2.makeGoonManDo();
		// 업캐스팅했던(자식 -> 부모: 부모타입 됐던 자식을)객체를 다시 자식타입으로
		// 원래 자기 타입으로 돌아가야돼 : PCH -> PCH로 
		// PCHJajangmyeon pch2 = (PCHJajangmyeon)p2;
		// --> 이렇게 하면 오류나 : java.lang.ClassCastException
	}

}
