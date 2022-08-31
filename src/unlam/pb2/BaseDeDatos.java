package unlam.pb2;

import java.util.ArrayList;

public class BaseDeDatos {
	private ArrayList<Contacto> contactosEnLaBase = new ArrayList<Contacto>();
	private ArrayList<Contacto> clientes = new ArrayList<Contacto>();
	
	public void agregarContactoALaBaseDeDatos(Contacto contactoParaAgregar) {
		contactosEnLaBase.add(contactoParaAgregar);
	}

	public Contacto realizarNuevaLlamada() {
		for (Contacto contacto : contactosEnLaBase) {
			if(contacto.getEstadoCliente()=="No" && contacto.getVolverALlamar()=="Si") {
				return contacto;
			}
		}
		return null;
	}

	public void llamadaExitosa(Contacto clienteObtenido) {
		clienteObtenido.setEstadoCliente("Si");
		clienteObtenido.setVolverALlamar("No");
		contactosEnLaBase.remove(clienteObtenido);
		clientes.add(clienteObtenido);
	}

	public Boolean verificarCliente(Contacto contactoBuscado) {
		if(clientes.contains(contactoBuscado)) {
			return true;
		}
		return false;
	}

}
