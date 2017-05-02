package state;

public class ExampleClient {

	public static void main(String[] args) {
		//½ô¼±ÏîÄ¿
		Work emergencyPorjects = new Work();
		emergencyPorjects.setHour(9);
		emergencyPorjects.WriteProgram();
		
		emergencyPorjects.setHour(10);
		emergencyPorjects.WriteProgram();
		
		emergencyPorjects.setHour(12);
		emergencyPorjects.WriteProgram();
		
		emergencyPorjects.setHour(13);
		emergencyPorjects.WriteProgram();
		
		emergencyPorjects.setHour(14);
		emergencyPorjects.WriteProgram();
		
		emergencyPorjects.setHour(17);
		emergencyPorjects.WriteProgram();
		
		
		
		emergencyPorjects.setFinished(true);
		
		emergencyPorjects.setHour(19);
		emergencyPorjects.WriteProgram();
		
		emergencyPorjects.setHour(22);
		emergencyPorjects.WriteProgram();
	}

}
