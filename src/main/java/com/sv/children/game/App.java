package com.sv.children.game;

import java.util.List;

/**
 * Client class
 *
 */
public class App {
	public static void main(String[] args) {

		if (args.length == 2) {
			int n = Integer.valueOf(args[0]);
			int k = Integer.valueOf(args[1]);

			ChildrenGame cg = new ChildrenGame();
			List<String> list = cg.printEliminationOrder(k, n);
			if(!list.isEmpty()) {
			for (int i = 0; i < list.size() - 1; i++) {
				System.out.println("Eliminated " + list.get(i));
			}
			System.out.println("Winner is  " + list.get(list.size() - 1));
			}
		} else
			System.out.println("Program expects two positive integer as inputs");
	}
}
