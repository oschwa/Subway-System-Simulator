package cs244.pauloAndOliver;

public class TerminalInfo implements Comparable<TerminalInfo>{
	private Terminal terminal = null;
	private Terminal predecessor = null;
	private int cost;
	
	public TerminalInfo (Terminal t) {
		terminal = t;
	}
	
	public Terminal getTerminal() {
		return terminal;
	}
	public void setPredecessor(Terminal t) {
		predecessor = t;
	}
	
	public Terminal getPredecessor() {
		return predecessor;
	}
	
	public void updateCost(int add) {
		cost += add;
	}
	
	public int getCost() {
		return cost;
	}
	
	//compare method for Info objects, used in priority queue operations.
	@Override
	public int compareTo(TerminalInfo o) {
		if (o.cost < cost) {
			return 1;
		}
		
		else if (o.cost > cost) {
			return 1;
		}
		return 0;
	}
	
	
	
}
