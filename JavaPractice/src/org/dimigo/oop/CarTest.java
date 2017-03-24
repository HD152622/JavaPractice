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
public class CarTest {
	public static void main(String[] args) {
		System.out.println("<<자동차 목록>>");
	Car car = new Car();
	car.setCompany("현대자동차");
	car.setModel("제네시스");
	car.setColor("검정색");
	car.setMaxSpeed(225);
	car.setPrice(50000000);
	System.out.println("제조사명: " + car.getCompany());
	System.out.println("모델명: " + car.getModel());
	System.out.println("색상: " + car.getColor());
	System.out.printf("최대속도: %dkm\n" , car.getMaxSpeed());
	System.out.printf("가격: %,d원\n\n" , car.getPrice());
	
	
	Car car2 = new Car();
	car2.setCompany("기아자동차");
	car2.setModel("K7");
	car2.setColor("흰색");
	car2.setMaxSpeed(246);
	car2.setPrice(40000000);
	car2.setCompany("기아자동차");
	System.out.println("제조사명: " + car2.getCompany());
	System.out.println("모델명: " + car2.getModel());
	System.out.println("색상: " + car2.getColor());
	System.out.printf("최대속도: %dkm\n",car2.getMaxSpeed());
	System.out.printf("가격: %,d원\n\n",car2.getPrice());
	
	
	Car car3 = new Car();
	car3.setCompany("삼성자동차");
	car3.setModel("SM7");
	car3.setColor("회색");
	car3.setMaxSpeed(200);
	car3.setPrice(38000000);
	System.out.println("제조사명: " + car3.getCompany());
	System.out.println("모델명: " + car3.getModel());
	System.out.println("색상: " + car3.getColor());
	System.out.printf("최대속도: %dkm\n",car3.getMaxSpeed());
	System.out.printf("가격: %,d원\n\n",car3.getPrice());
	}
}
