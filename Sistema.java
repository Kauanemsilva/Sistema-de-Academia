
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pacotes pacote = new Pacotes();
		String planoLight = pacote.getLight();
		String planoFull = pacote.getFull();
		String planoTop = pacote.getTop();
		
		ArrayList<Cliente> clientes = new ArrayList<>();
				
		Cliente cliente1 = new Cliente("Nebulosa","01234567890", 32, 90.0, 1.8, Status.ATIVO, planoTop);
				
		clientes.add(cliente1);
		
		Principal.menuPrincipal(clientes);
				
	}
	
}