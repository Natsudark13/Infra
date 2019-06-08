package Logic;

public class ProcessB extends Process{

	
	public ProcessB(){
		
		this.memoryUse = 2;
		
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
