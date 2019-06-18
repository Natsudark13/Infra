package Logic;

public abstract class Process {

	protected int memoryUse;
	protected int ID;
	private static int IDCounter;
	protected String type;
	protected int priority;
	protected String state;
	protected int processTime;
	
	public abstract int realizeProcess();

	public Process(){
		this.ID = IDCounter + 1;
		IDCounter++;
	}
	
	public int getMemoryUse() {
		return memoryUse;
	}

	public void setMemoryUse(int memoryUse) {
		this.memoryUse = memoryUse;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getProcessTime() {
		return processTime;
	}

	public void setProcessTime(int processTime) {
		this.processTime = processTime;
	}
	
	
	
}