package in.co.niharika;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


public class CollectionsNiharika {
	public void NormalArrays() {
		int [] arr = new int[4];
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
		System.out.println("" + arr[0] + arr[1] + arr[2] + arr[3]);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
		public void ListArraysNiharika() {
			//If want integer you have to write complete 'integer' not int
			List<String> list = new ArrayList<String>();
			list.add("str1");
			list.add("str5");
			list.add("str3");
			list.add("str5");
			list.add("str5");
			list.add("str5");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			list.remove(2);
			list.add(2, "strr3");
			System.out.println(list.contains("st2"));
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		
		}

		public void SortArraysNiharika() {
			List<String> list = new ArrayList<String>();
			list.add("str1");
			list.add("str7");
			list.add("str6");
			list.add("str5");
			list.add("str2");
			list.add("str3");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println("After Sorting");
			Collections.sort(list);
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
		public void SetsNiharika() {
			Set<String> set = new HashSet<>();
			set.add("str1");
			set.add("str5");
			set.add("str3");
			set.add("str5");
			set.add("str5");
			set.add("str4");
			System.out.println(set.toString());
		}
		
		public void QueueNiharika(){
			Queue<String> queue = new PriorityQueue<>();
			queue.add("elm1");
			queue.add("elm2");
			queue.add("elm3");
			queue.add("elm4");
			//Poll will increment the cursor and remove the top of stack
			System.out.println(queue.poll());
			System.out.println(queue.size());
			//Peek will just increment the cursor and doesn't remove the top of stack
			System.out.println(queue.peek());
			System.out.println(queue.poll());
			System.out.println(queue.poll());

		}
		
		public void MapNiharika(){
			Map<String, String> student = new HashMap<>();
			student.put("name", "Niharika");
			student.put("age", "25");
			student.put("number", "std001");
			student.put("address", "Chandapura, Bengaluru - 001");
			student.put("ADAAR", "1230098");
			student.put("age", "26");
			System.out.println(student);
			System.out.println(student.get("address"));

		}
}
