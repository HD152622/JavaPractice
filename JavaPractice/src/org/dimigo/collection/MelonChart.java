/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonChart
 *
 * 1.개요:
 * 2.작성일: 2017. 6. 12.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>( );
		
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?" , "언니쓰"));
		System.out.println("--<<멜론차트>>--");
		printList(list);
		
		System.out.println("--<<2위 추가>>--");
		list.add(1, new Music("시그널" , "트와이스"));
		printList(list);
		
		System.out.println("--<<3위 변경>>--");
		list.set(2,new Music("팔레트" , "아이유"));
		printList(list);
		
		System.out.println("--<<2위곡 삭제>>--");
		list.remove(1);
		printList(list);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		list.clear();
		
	}
	public static void printList(List<Music> list){
		int i = 1;
		for(Music a : list){
			System.out.printf("%d. %s\n" , i++,a);
		}
		System.out.println();
	}

}
