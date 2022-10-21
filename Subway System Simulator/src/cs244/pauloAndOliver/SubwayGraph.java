package cs244.pauloAndOliver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import cs244pauloAndOliver.TerminalEdge;

public class SubwayGraph {
	
	//The list itself lies here in two forms, one for searching the to vertices and from vertices. This makes Djikstra's Algorithm
	//easier to implement.
	private HashMap<Terminal, ArrayList<TerminalEdge>> toTerminals = new HashMap<Terminal, ArrayList<TerminalEdge>>();
	
	private HashMap<Terminal, ArrayList<TerminalEdge>> fromTerminals = new HashMap<Terminal, ArrayList<TerminalEdge>>();
	
	//TBD
	private int numOfTerminals = 20;
		
	private Terminal[] terminals = new Terminal[numOfTerminals];
	
	
	public SubwayGraph() {
		//Terminals are created here.
		for (int i = 0; i < numOfTerminals; i++) {
			String tName = "Terminal " + i;
			addTerminal(tName);
		}
		
		//Here is where the edges and graph itself is constructed.
		
		
	}
	
	private void addTerminal(String tName) {
		Terminal t = new Terminal(tName);
		toTerminals.put(t, new ArrayList<TerminalEdge>());
		fromTerminals.put(t, new ArrayList<TerminalEdge>());
	}
	
	private void addTerminalEdge(int timeCost, int ticketCost, Terminal to, Terminal from) {
		TerminalEdge e = new TerminalEdge(timeCost, ticketCost, to, from);
		toTerminals.get(to).add(e);
		fromTerminals.get(from).add(e);
	}
	
	//returns a terminal in the graph
	public Terminal getTerminal(String tName) {
		for (int i = 0; i < numOfTerminals; i++) {
			Terminal temp = terminals[i];
			if (temp.terminalName.equals(tName)) {
				return temp;
			}
		}
		return null;
	}
	
	//returns an edge in the graph
	public TerminalEdge getTerminalEdge(Terminal t1, Terminal t2) {
		for (TerminalEdge e : fromTerminals.get(t1)) {
			if (e.getToTerminal() == t2) {
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<Terminal> getShortestPath(Terminal start, Terminal end) {
		//Make TerminalInfo Objects
		TerminalInfo[] tInfo = new TerminalInfo[numOfTerminals];
		PriorityQueue<TerminalInfo> terminalQueue = new PriorityQueue<TerminalInfo>();
		for (int i = 0; i < numOfTerminals; i++) {
			
		}
		
		
		
		return null;
	}
	
	
	
	
}
