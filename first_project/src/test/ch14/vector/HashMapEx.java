package test.ch14.vector;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		//HashMap<key , 객체(저장할 값)>
		HashMap<String , Integer> map = new HashMap<>();
		
		map.put("김명현", 85);
		map.put("홍길동", 90);
		map.put("김첨지", 80);
		map.put("박지성", 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값 얻기
		String key = "김명현";
		int value = map.get(key);
		System.out.println("점수: " +value);
		
		//반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); //반복된 키를 얻는다.
		
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k +":"+ v);
		}
		
		//반복해서 키와 값을 얻기 두번째 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Interator<Entry<String, Integer>> enteyIterator = entrySet.iterator();
		
		while(entryIterator.hasNext)
		
		
	}

}
