/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1.개요:
 * 2.작성일: 2017. 3. 13.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>\n");
		int money = 1700000;
		int employee = 3;
		int store = 1500;
		long every = money*employee*12L*store;
		System.out.printf("월 평균 급여 : %,d원\n" , money);
		System.out.printf("점포 내 직원수 : %d명\n" , employee);
		System.out.printf("점포수 : %,d개\n" , store);
		System.out.printf("연간 인건비 : %,d원" , every);

	}

}
