/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 *
 * 1.개요:
 * 2.작성일: 2017. 6. 13.
 * </pre>
 *
 * @author    : 유민
 * @version   : 1.0
 */
public class MelonGenreChart {

	
	public static void main(String[] args) {
	
		List<Music> Blist = new ArrayList<>();
		List<Music> Dlist = new ArrayList<>();
		Map<String, List<Music>> map = new HashMap<>();
		
		
		
		Dlist.add(new Music("I LUV IT" , "PSY"));
		Dlist.add(new Music("맞지?" , "언니쓰"));
		Blist.add(new Music("팔레트" , "아이유"));
		map.put("[발라드]", Blist);
		map.put("[댄스]", Dlist);
		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);
		
		Dlist.set(1, new Music("시그널" , "트와이스"));
		System.out.println("--<<댄스 2위곡 변경>>--");
		printMap(map);
		
		Dlist.remove(0);
		System.out.println("--<<댄스1위곡 삭제>>--");
		printMap(map);
		
		Dlist.clear();
		Blist.clear();
		map.clear();
		System.out.println("--<<전체 리스트 삭제>>--");
		printMap(map);
		
		
	}
	public static void printMap(Map<String, List<Music>> map){
		for (String key : map.keySet()) {
			System.out.println("["+key+"]");
			int i = 1;
			for(Music value : map.get(key)){
				System.out.println(i++ + ". " + value);
			}
			System.out.println();
		}
	}

}