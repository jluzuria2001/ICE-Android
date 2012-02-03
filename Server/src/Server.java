import Demo._HelloDisp;
import Ice.Current;

class Server extends Ice.Application
{
	class HelloI extends _HelloDisp
	{

		public void sayHello(int delay, Current __current) {
	        if(delay > 0)
	        {
	            try
	            {
	                Thread.currentThread().sleep(delay);
	            }
	            catch(InterruptedException ex1)
	            {
	            }
	        }
	        System.out.println("Hello World!");
		}

			
	}
	
	static public void main (String[] args){
		
		Server s = new Server();
		int estado = s.main("Server", args);
		System.exit(estado);
	}
	
	@Override
	public int run(String[] args) {
		Ice.ObjectAdapter adapter = communicator().createObjectAdapterWithEndpoints(
				"Hello", "default -p 60000");
		adapter.add(new HelloI(), communicator().stringToIdentity("hola"));
		adapter.activate();
		communicator().waitForShutdown();
		return 0;
	}
	
}