package menuInteractivo;


//import org.junit.jupiter.api.Test;

import com.djimenez.menuInteractivo.controlador.PlatilloControlador;
import com.djimenez.menuInteractivo.controlador.impl.PlatilloControladorImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Platillo;

class TestMenu {
	
	private PlatilloControlador platilloControlador;

//	@Test
	void test() {
		
//		clienteControlador = new ClienteControladorImpl();
//		Cliente nuevoCliente = new Cliente();
//		nuevoCliente.setCedula("1714004379");
//		nuevoCliente.setNombre("Danny Fernando");
//		nuevoCliente.setApellido("Jiménez Guerrón");
//		nuevoCliente.setCorreo("dannyferjg@hotmail.com");
//		nuevoCliente.setContrasenia("1234");
//		clienteControlador.insertarCliente(nuevoCliente);
		
//		comboControlador = new ComboControladorImpl();
//		Combo nuevoCombo = new Combo();
//		nuevoCombo.setNombre("Combo1");
//		nuevoCombo.setDescripcion("Salchipapa");
//		nuevoCombo.setPrecio(0.35);
//		nuevoCombo.setEstado(true);
//		comboControlador.insertarCombo(nuevoCombo);
		
//		comboControlador = new ComboControladorImpl();
//		List<Combo> listaC = comboControlador.listarComboTQ();
//		for(Combo tmp:listaC) {
//			System.out.println(tmp);
		
//		comboControlador = new ComboControladorImpl();
//		Combo eliminarCombo = new Combo();
//		eliminarCombo.setIdCombo(2);
//		eliminarCombo.setEstado(true);
//		comboControlador.eliminarCombo(eliminarCombo);
		
		platilloControlador = new PlatilloControladorImpl();
		Platillo nuevoPlatillo = new Platillo();
		nuevoPlatillo.setNombre("Platillo");
		nuevoPlatillo.setDescripcion("Descripción");
		nuevoPlatillo.setPrecio(18);
		platilloControlador.insertarPlatillo(nuevoPlatillo);
	
		}
	
}
