import Demo.HelloPrx;
import Demo.HelloPrxHelper;

class Client extends Ice.Application{

	static public void main (String[] args){
		
		Client s = new Client();
		int estado = s.main("Client", args);
		System.exit(estado);

	}
	
	@Override
	public int run(String[] args) {
        int delay = 0;

		Ice.ObjectPrx objeto = communicator().stringToProxy("hola:tcp -h 127.0.0.1 -p 60000");
		HelloPrx hola = HelloPrxHelper.uncheckedCast(objeto);
		hola.sayHello(delay);
		return 0;
	}
	
	
}
