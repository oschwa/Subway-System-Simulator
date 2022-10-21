package cs244pauloAndOliver;

import cs244.pauloAndOliver.Terminal;

public class TerminalEdge{
	private Terminal toTerminal = null;
	private Terminal fromTerminal = null;
	//Time cost is in minutes
	private int timeCost = 0;
	//Time cost is in dollars
	private int ticketCost = 0;
	
	
	public TerminalEdge(int timeCost, int ticketCost, Terminal to, Terminal from) {
		toTerminal = to;
		fromTerminal = from;
		this.timeCost = timeCost;
		this.ticketCost = ticketCost;
	}
	
	public Terminal getToTerminal() {
		return toTerminal;
	}
	
	public Terminal getFromTerminal() {
		return fromTerminal;
	}
	
	public int getTimeCost() {
		return timeCost;
	}
	
	public int getTicketCost() {
		return ticketCost;
	}
}
