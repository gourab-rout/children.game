package com.sv.children.game;

import java.util.*;

/**
 * The class calculates the order in which children get eliminated
 * 
 * @author Gourab Rout
 * @since 2019-02-14
 */
public class ChildrenGame {

	/**
	 * 
	 * @param k
	 *            elimination number
	 * @param n
	 *            Number of children standing around the circle.
	 * @return resultList the list in the order of children getting eliminated
	 */
	public List<String> printEliminationOrder(int k, int n) {
		List<String> resultList = new ArrayList<String>();

		try {
			validateInput(k,n);
			
			UniqueSequence sequence = new UniqueSequence();
			Queue<String> childQueue = new LinkedList<String>();

			// Complexity o(n)
			for (int i = 1; i <= n; i++) {
				childQueue.add(sequence.generetaeSequence());
			}

			// Complexity o(n^2)
			while (!childQueue.isEmpty()) {
				for (int i = 0; i < k - 1; i++) {
					childQueue.add(childQueue.remove()); // 2 4 3 1 ;
				}
				resultList.add(childQueue.remove());

			}
			return resultList;
		} catch (IllegalArgumentException e) {
			System.err.println("k and n must be valid positive integers");
			throw e;
		} catch (Exception e) {
			System.err.println("Generic error ");
			return resultList;
		}
	}
	/**
	 * Method to validate the arguments passed
	 */
	public void validateInput(int k, int n) {
		
		if (k<1 || n<1) {
			throw new IllegalArgumentException("k and n must be valid positive integers");
		}
		
	}
}
