package Logic;

public class ProcessA extends Process{

	public ProcessA(){
		this.memoryUse = 20;
		this.type = "A";
	}
	
	@Override
	public int realizeProcess() {
		int counter = 0;
		while(counter != 20000){
			counter++;
		}
		return 1;
	}
	
}
