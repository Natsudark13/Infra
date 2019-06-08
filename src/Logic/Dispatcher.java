package Logic;

import java.util.ArrayList;

public class Dispatcher {
	private ArrayList<String> memory ;
	private ArrayList<Process> running;
	private ArrayList<Process> readyQueue;
	private ArrayList<Process> readySuspendedQueue;
	private ArrayList<Process> blockedQueue; 
	private ArrayList<Process> blockedSuspendedQueue;

	//Se crean las listas de espera del dispatcher de 5 estados
	public Dispatcher(){
		this.memory = new ArrayList<String>(40); 
		this.running  = new ArrayList<Process>(3); 
		this.readyQueue = new ArrayList<Process>(); 
		this.readySuspendedQueue = new ArrayList<Process>(); 
		this.blockedQueue = new ArrayList<Process>(); 
		this.blockedSuspendedQueue = new ArrayList<Process>(); 
		
	}
	
	public void createNewProcess(String pName){
		Process process = new ProcessFactory().createProcess(pName);
	}
	
	
	public static void main(String[] args) {
		Process x = new ProcessB();
		long startTime = System.nanoTime();
		x.realizeProcess();
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		System.out.println(duration);
    }
	
}
