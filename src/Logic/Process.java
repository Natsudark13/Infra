package Logic;

public abstract class Process {

	protected int memoryUse;
	protected int ID;
	protected String type;
	public abstract int realizeProcess();

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
	
	
}
