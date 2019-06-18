package Logic;

public class ProcessB extends Process{

	
	public ProcessB(){
		super();
		this.memoryUse = 2;
		this.type = "B";
	}
	
	@Override
	public int realizeProcess() {
		int counter = 0;
		while(counter != 50){
			counter++;
		}
		return 1;
	}
	

}
