package caveExplorer;

public class Enemy extends NPC {

	public Enemy() {
		
	}

	public void interact() {
		CaveExplorer.print("Let's interact! Please give show me what kind of material you want to buy. Type 'bye' to stop.");
		String s = CaveExplorer.in.nextLine();
		while(s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("gold")) {
			CaveExplorer.print("Interesting, lets make a deal!");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("Uh oh, the police are after me, I am going to run!!");
		
	}

}
