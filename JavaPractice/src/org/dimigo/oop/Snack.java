/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Snack
 *
 * 1.개요:
 * 2.작성일: 2017. 4. 6.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class Snack {
	
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){
	
	}
	public Snack(String name , String company , int price , int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	
	public String setName(){
		return company;
	}
	public String setCompany(){
		return company;
	}
	public int setPrice(){
		return price;
	}
	public int setNumber(){
		return number;
	}
	
	
	public void getName(String newName){
		name = newName;
	}
	public void getCompany(String newCompany){
		company = newCompany;
	}
	public void getPrice(int newPrice){
		price = newPrice;
	}
	public void getNumber(int newNumber){
		number = newNumber;
	}
	
	public int calcPrice(){
		return price * number;
	}

	public String toString(){
		return "이름 :" + name +"\n" + "회사 : " + company + "\n" +"가격 : " + price +"원" +"\n"+ "개수 : " + number +"개"+ "\n";
	}
	
}
