package Logic;

public class ProcessC extends Process{

public ProcessC(){
		
		this.memoryUse = 1;
		this.type = "C";
	}
	
	@Override
	public int realizeProcess() {
		int counter = 0;
		while(counter != 50){
			counter++;
			counter--;
		}
		return 1;
	}
}
