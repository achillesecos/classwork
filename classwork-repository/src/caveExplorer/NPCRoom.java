package caveExplorer;

public class NPCRoom extends CaveRoom{

	private NPC npc;
	
	public NPCRoom(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	public boolean canEnter() {
		return npc == null;
	}
	
	public void enterNPC(NPC n) {
		this.npc = n;
	}
	
	public void leaveNPC() {
		this.npc  = null;
	}
	
	public boolean containsNPC() {
		return npc != null;
	}
	
	/*
	 * Everything aboce is a NEW function of a CaveRoom, 
	 * the method
	 */

	/*
	 *Override to change description of possible moves.  
	 */
	private void printValidMoves() {
		System.out.println("You can only enter 'w', 'a', 's', or 'd' to move "
				+ "or you can pres 'e' to interact.");
	}
	
	public String validMoves() {
		return "wdsae";
	}

	private void performAction(int direction) {
		if(direction == 4) {
			if(npc != null && npc.isActive()) {
				npc.interact();
			}
			else {
				CaveExplorer.print("there is nothing interact with");
			}
		}
		else {
			CaveExplorer.print("That key does nothing");
		}
	}
	
	public String getDescription() {
		if(containsNPC() && npc.isActive()) {
			return super.getDescription() + "\n" + npc.getDescription();
		}
		else if(containsNPC() && !npc.isActive()) {
			return super.getDescription() + "\n" + npc.getInactiveDescription();
		}
		else {
			return super.getDescription();
		}
	}
}
