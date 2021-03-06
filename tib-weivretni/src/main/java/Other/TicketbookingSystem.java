//https://www.geeksforgeeks.org/ola-interview-experience-set-14-sde-1/

package Other;

import java.util.LinkedList;
import java.util.Queue;

public class TicketbookingSystem {
	public static int findTimeToBookNtickets(int tickets[], int p) {
		int countTime = 0;
		int ticketArraySize = tickets.length;
		int ticketAvail = 0;
		int ticket = tickets[p];
		Queue<Pair> queue = new LinkedList<>();
		for (int i = 0; i < ticketArraySize; i++) {
			queue.add(new Pair(tickets[i], i == p));
		}
		while (true) {
			// Get first element from array
			Pair pair = queue.peek();
			int value = pair.key;
			boolean isP = pair.value;
			countTime++;
			if (value == ticket && isP && ++ticketAvail == ticket) {
				return countTime;
			}
			Pair temp = queue.poll();
			queue.add(temp);
		}
	}

	public static void main(String[] args) {
		System.out.println(findTimeToBookNtickets(new int[] { 5, 2, 6, 3 }, 1));
	}
}
