/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 *
 * 1.개요:
 * 2.작성일: 2017. 5. 8.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class PersonTest2 {

	public static void main(String[] args) {
		
		Person p[]= {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나까"),
				new Chinese("왕밍")
		};
		
		for (Person person : p) {
			greeting(person);
		}
		
	}
	
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHellow();
		p.sayBye();
		System.out.println("\n");
	}
}
