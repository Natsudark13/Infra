package Logic;

public class ProcessFactory {
	
	public Process createProcess(String type){
		Process x;
		if(type == "A"){
			x = new ProcessA();
		}
		if(type == "B"){
			x = new ProcessB();
		}
		else{
			x = new ProcessC();
		}
		return x;
	}

}
