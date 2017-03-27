/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 *
 * 1.개요:
 * 2.작성일: 2017. 3. 23.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class Car2Test {
	public static void main(String[] args) {
		System.out.println("<<자동차 목록>>");
	
	Car2 car = new Car2("현대자동차" , "제네시스" , "검정색" , 225 ,50000000);
	System.out.println("제조사명: " + car.getCompany());
	System.out.println("모델명: " + car.getModel());
	System.out.println("색상: " + car.getColor());
	System.out.printf("최대속도: %dkm\n" , car.getMaxSpeed());
	System.out.printf("가격: %,d원\n\n" , car.getPrice());
	
	
	Car2 car2 = new Car2("기아자동차" , "k7" , "흰색" , 246 ,40000000);
	System.out.println("제조사명: " + car2.getCompany());
	System.out.println("모델명: " + car2.getModel());
	System.out.println("색상: " + car2.getColor());
	System.out.printf("최대속도: %dkm\n",car2.getMaxSpeed());
	System.out.printf("가격: %,d원\n\n",car2.getPrice());
	
	
	Car2 car3 = new Car2("삼성자동차" , "SM7" , "회색" , 200 , 38000000);
	
	System.out.println("제조사명: " + car3.getCompany());
	System.out.println("모델명: " + car3.getModel());
	System.out.println("색상: " + car3.getColor());
	System.out.printf("최대속도: %dkm\n",car3.getMaxSpeed());
	System.out.printf("가격: %,d원\n\n",car3.getPrice());
	}
}
