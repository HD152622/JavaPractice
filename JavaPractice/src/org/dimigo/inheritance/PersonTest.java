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
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		System.out.println(p.toString());
		System.out.println(k.toString());
		System.out.println(j.toString());
		System.out.println(c.toString());
		System.out.println("\n");
		p.sayHellow();
		k.sayHellow();
		j.sayHellow();
		c.sayHellow();
		System.out.println("\n");
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
		
		
	}

}
