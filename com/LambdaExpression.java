package com;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.*;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		
		//method 1
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			System.out.println("Method 1 : Iterator value:: " + n);
		}
		
		//method 2 using consumer interface implementation
		class MyConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Method 2: Consumer impl value:: " + t);
			}
		}
		
		MyConsumer action = new MyConsumer();
		list.forEach(action);
		
		//Method 3 : traversing with anonymous consumer interface implementation
		list.forEach( new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Method 3: For each anonymous class value :: " + t);
			}
		});
		
		//Method 4: Explicit lambda function
		Consumer<Integer> listaction = n -> {
			System.out.println("Method 4: For each lambda implementation value :: " + n);
		};
		list.forEach(listaction);
		
		//Method 5 :  Implicit lambda function
		list.forEach(n -> {
			System.out.println("Method 5: For each implementation value :: " + n);
		});
		
	
	}
}
