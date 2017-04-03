/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1.개요:
 * 2.작성일: 2017. 4. 3.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] questions  = {"1.가장 좋아하는 가수는?" , "2.가장 좋아하는 배우는?" , "3.가장 좋아하는 과목은?"};
		String[] answers = {"제드" , "오달수" , "수학"};
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
		for (int i = 0; i<3; i++){
			System.out.println(questions[i]);
			answer = sc.nextLine();
				if (answers[i].equals(answer)){
					System.out.println("정답입니다!");
				}
				else{
					System.out.println("틀렸습니다!");
				}
		}
		
		System.out.println("<<결과 출력>>");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 3; i++){
			sb.append(questions[i]).append(" " + answers[i]).append("입니다.\n");
		}
		System.out.println(sb.toString());
	}

}
