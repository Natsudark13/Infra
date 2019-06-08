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
		int calcultion = this.memoryCalcultion(process.memoryUse);
		
		if(calcultion < 40){
			
			if(running.size() < 2){
				
				running.add(process);
			
			}else{
					
				readyQueue.add(process);
					
			}
			
		}else{
			
			readySuspendedQueue.add(process);
		}
	}
	
	//Cambiar como es la suma por el size(0) empieza de cero
	private int memoryCalcultion(int processSize){
		int temp;
		int memorySize = memory.size();
		temp = memorySize + processSize;
		return temp;
		
	}
	
	private void addMemory(int processSize){
		int temp;
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
