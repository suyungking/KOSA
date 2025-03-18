package pren;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import lombok.experimental.var;

public class PrList {
	public static void main(String[] args) {
		HashMap<String, HashMap<Integer, Integer>> drink_menu = new HashMap<>();
		
		
		HashMap<Integer, Integer> soda = new HashMap<>();
		soda.put(2000, 15);
		HashMap<Integer, Integer> coca = new HashMap<>();
		coca.put(2300, 18);
		HashMap<Integer, Integer> water = new HashMap<>();
		water.put(800, 18);
		HashMap<Integer, Integer> coffe = new HashMap<>();
		coffe.put(700, 5);
		HashMap<Integer, Integer> milks = new HashMap<>();
		milks.put(2000, 15);
		
		HashMap<Integer, Integer> pocai = new HashMap<>();
		pocai.put(2000, 15);
			
		drink_menu.put("칠성사이다", soda);
		drink_menu.put("삼다수", water);
		drink_menu.put("레스비", coffe);
		drink_menu.put("밀키스", milks);
		drink_menu.put("포카리", pocai);
		
	
		for (var menu : drink_menu.entrySet()) {
			String drink_name = menu.getKey();
			HashMap<Integer, Integer> drink_inven = menu.getValue();
			System.out.print(drink_name + " : ");
			for (var inven : drink_inven.entrySet()) {
				int drink_price = inven.getKey();
				int drink_quanity = inven.getValue();
				System.out.println(drink_price + "원," + drink_quanity+"개");
			}
		}
		

//		price_inventory.put(2000, 30);
//		price_inventory.put(2300, 18);
//		price_inventory.put(800, 18);
//		price_inventory.put(700, 5);
//		price_inventory.put(1800, 10);
//		price_inventory.put(2000, 15);
//
//		drink_menu2.put("칠성사이다", price_inventory);
//		drink_menu2.put("삼다수", price_inventory);
//		drink_menu2.put("레스비", price_inventory);
//		drink_menu2.put("밀키스", price_inventory);
//		drink_menu2.put("포카리", price_inventory);

		

//		drink_menu.put("칠성사이다", 2000);
//		drink_menu.put("코카콜카", 2300);
//		drink_menu.put("삼다수", 800);
//		drink_menu.put("레스비", 700);
//		drink_menu.put("밀키스", 1800);
//		drink_menu.put("포카리 스웨트", 2200);
////
//		for (var menu : drink_menu.entrySet()) {
//			String drink_name = menu.getKey();
//			int drink_price = menu.getValue();
//			System.out.println(drink_name + " : " + drink_price);
//		}
//
//		System.out.println("---------------------------");
//		for (String key : drink_menu1.keySet()) {
//			List<Integer> values = drink_menu1.get(key);
//			System.out.println(key + " -> " + values);
//		}
//
//		System.out.println();
//
//		System.out.println("---------------------------");
//		for ( Map.Entry<String, HashMap<Integer, Integer>> key : drink_menu2.entrySet()) {
//			String outerKey = key.getKey();  // Key (String) 접근
//		    HashMap<Integer, Integer> innerMap = key.getValue();  // Value (내부 HashMap) 접근
//		    System.out.print("Key: " + outerKey +"->");
//			for (Map.Entry<Integer, Integer> k : innerMap.entrySet()) {
//				int drink_name = k.getKey();
//				int drink_price = k.getValue();
//				System.out.println(drink_name + " : " + drink_price);
//			}
//		}
//
////		// 중첩된 HashMap 순회: Entry로 출력
////        for (Map.Entry<String, HashMap<Integer, Integer>> entry : map.entrySet()) {
////            String outerKey = entry.getKey();  // 외부 HashMap의 Key (String)
////            HashMap<Integer, Integer> innerMap = entry.getValue();  // 외부 HashMap의 Value (내부 HashMap)
////
//            System.out.println("Key: " + outerKey);
//
//            // 내부 HashMap 순회
//            for (Map.Entry<Integer, Integer> innerEntry : innerMap.entrySet()) {
//                System.out.println("  Inner Key: " + innerEntry.getKey() + ", Inner Value: " + innerEntry.getValue());
//            }

	}

}
