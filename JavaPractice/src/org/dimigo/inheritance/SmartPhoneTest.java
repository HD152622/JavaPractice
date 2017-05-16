/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1.개요:
 * 2.작성일: 2017. 5. 16.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone s[] = {
				new IPhone("IPhone7" , "애플" , 900000),
				new Galaxy("GalaxyS8" , "삼성" , 800000)
		};
		
		for(SmartPhone phone : s){
			System.out.println(phone);
			phone.TurnOn();
			phone.pay();
			phone.useSpecialFuction(phone);
			phone.TurnOff();
			System.out.println();
		}
		
	}

}
