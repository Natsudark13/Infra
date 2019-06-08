package Logic;

public abstract class Process {

	protected int memoryUse;

	public abstract int realizeProcess();

	public int getMemoryUse() {
		return memoryUse;
	}

	public void setMemoryUse(int memoryUse) {
		this.memoryUse = memoryUse;
	}
	
	
}
