/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_PrimitiveDatatype
 *
 * 1.개요:
 * 2.작성일: 2017. 3. 9.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "아이유";
		boolean isMale  = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<<아이유프로필>>\n");
		System.out.printf("이름 : %s\n" , name);
		System.out.printf("성별 : ");
		if(isMale == false){
			System.out.printf("여자\n");
		}
		
		System.out.printf("나이 : %d\n" , age);
		System.out.printf("키 : %.1fcm\n" , height);
		System.out.printf("몸무게 : %.1fkg\n"  ,weight);
		System.out.printf("혈핵형 : %s형\n" , bloodType);
				
	}

}
