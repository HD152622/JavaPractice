/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_DBTest
 *
 * 1.개요:
 * 2.작성일: 2017. 5. 25.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		IDBManager[] dbs = {
				IDBManager.getDBObject("ORACLE"),
				IDBManager.getDBObject("SYBASE")
		};
		System.out.println("<<변경전>>");
		crud(dbs[0]);
		System.out.println("");
		System.out.println("<<변경후>>");
		crud(dbs[1]);
		
	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		
		
	}

}
