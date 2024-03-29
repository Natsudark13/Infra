package Logic;

import java.util.ArrayList;

public class Dispatcher {
	private int memory ;
	private ArrayList<Process> running;
	private ArrayList<Process> readyQueue;
	//private ArrayList<Process> readySuspendedQueue;
	private ArrayList<Process> blockedQueue; 
	//private ArrayList<Process> blockedSuspendedQueue;
	private Recurso recurso1;
	private Recurso recurso2;
	//Se crean las listas de espera del dispatcher de 5 estados
	public Dispatcher(){
		memory = 0; 
		this.running  = new ArrayList<Process>(3); 
		this.readyQueue = new ArrayList<Process>(); 
		//this.readySuspendedQueue = new ArrayList<Process>(); 
		this.blockedQueue = new ArrayList<Process>(); 
		//this.blockedSuspendedQueue = new ArrayList<Process>(); 
		this.recurso1 = new Recurso();
		this.recurso2 = new Recurso();
		
	}
	
	//Creates a new process, if the memory queque is full the process goes to the blockedQueue, else if the running queque is full the process
	//goes to readyQueue and if there is not a problem with memory and running queque the process goes to the running queque
	public void createNewProcess(String pName){
		Process process = new ProcessFactory().createProcess(pName);
		int calcultion = this.memoryCalcultion(process.memoryUse);
		
		//Si el pName es igual a B hay que hacer otro if para ver los recursos y usar el semaforo
		if(calcultion <= 40){//reparar
			
			if(running.size() < 2){
				
				running.add(process);
				addMemory(process.memoryUse);
				
			}else{
					
				readyQueue.add(process);
					
			}
			
		}else{
			
			blockedQueue.add(process);
		}
	}
	
	public void freeProcess(String pName){
		Process process = new ProcessFactory().createProcess(pName);
		int calcultion = this.memoryCalcultion(process.memoryUse);
		
		//Si el pName es igual a B hay que hacer otro if para ver los recursos y usar el semaforo
		if(calcultion <= 40){//reparar
			
			if(running.size() < 2){
				
				running.add(process);
				addMemory(process.memoryUse);
				
			}else{
					
				readyQueue.add(process);
					
			}
			
		}else{
			
			blockedQueue.add(process);
		}
	}
	
	//Se hace el calculo si la cola de la memoria esta llena o no, retorna el valor de la memoria + el valor del proceso
	private int memoryCalcultion(int processSize){
		int temp;
		int memorySize = memory;
		temp = memorySize + processSize;
		return temp;
		
	}
	
	
	private void addMemory(int processSize){
		
		memory = memory + processSize;
		
	}
	
	private void freeMemory(int processSize){
			
		memory = memory - processSize;
		
		}
	
	//Metodo auxilar para saber cuanto espacio ocupado tiene la memoria 
	private int addPriority(){
		int counter = 0;
		int temp = 0;
		while(memory.size() != counter){
			if(memory.get(counter).equals(1)){
				counter++;
			}
			temp++;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int xx = 0;
		Process x = new ProcessB();
		long startTime = System.nanoTime();
		while(xx != 1000000){
		x.realizeProcess();
		xx++;
		}
		long endTime = System.nanoTime();

		long duration = ((endTime - startTime)/1000000);  //divide by 1000000 to get milliseconds.
		System.out.println(duration);
		
    }
	
}
