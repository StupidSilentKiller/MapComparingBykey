package com.datastructure;

import java.util.*;

public class MapComparingBykey {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();
		map.put(103, "Mim");
		map.put(105, "Sejo");
		map.put(101, "Nipa");
		map.entrySet()
			.stream().sorted(Map.Entry.comparingByValue())
			.forEach(System.out::println);
		}
	}
}
