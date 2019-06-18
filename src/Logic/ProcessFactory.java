package Logic;

public class ProcessFactory {
	
	public Process createProcess(String type){
		Process x;
		if(type.equals("A")){
			x = new ProcessA();
		}
		if(type.equals("B")){
			x = new ProcessB();
		}
		else{
			x = new ProcessC();
		}
		return x;
	}

}
