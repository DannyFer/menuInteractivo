package com.djimenez.menuInteractivo.ws;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.primefaces.shaded.json.JSONObject;
import com.djimenez.menuInteractivo.controlador.impl.ClienteControladorImpl;
import com.djimenez.menuInteractivo.controlador.impl.PlatilloControladorImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Cliente;
import com.djimenez.menuInteractivo.modelo.entidad.Platillo;

@RequestScoped
@Path("")
@Produces("application/json")
@Consumes("application/json")
public class Rest {

	private ClienteControladorImpl clienteControladorImpl = new ClienteControladorImpl();
	private PlatilloControladorImpl platillosImp = new PlatilloControladorImpl();

	@GET
	@Path("/sesion")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response sesion(@QueryParam("correo") String correo, @QueryParam("pass") String pass) {
		String estado = "no";
		Cliente cliente = new Cliente();
		cliente = clienteControladorImpl.buscarPorCorreoCliente(correo);
		if (cliente != null) {
			if (cliente.getContrasenia().equals(pass)) {
				estado = "si";
			}
		}
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(estado).build();
	}
	
	@GET
	@Path("/ingreso")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response sesion2(@QueryParam("correo") String correo, @QueryParam("pass") String pass) {		
		Cliente cliente = new Cliente();
		cliente = clienteControladorImpl.buscarPorCorreoCliente(correo);
		
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(cliente).build();
	}
	
	@GET
	@Path("/platillos")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response platillos() {		
		List<Platillo> lista = new ArrayList<>();
		lista=platillosImp.listarPlatillo();
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(lista).build();
	}
	
	@POST
	@Path("/insertarCliente")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response insertarCliente(@QueryParam("cliente") JSONObject cli) {
		Cliente cliente = new Cliente();
		cliente.setApellido((String) cli.get("apellido"));
		cliente.setNombre((String) cli.get("nombre"));
		cliente.setContrasenia((String) cli.get("contrasenia"));
		cliente.setCorreo((String) cli.get("correo"));
		cliente.setEstado((boolean) cli.get("estado"));
		cliente.setTelefono((String) cli.get("telefono"));		
		clienteControladorImpl.insertarCliente(cliente);
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity("ok").build();
	}
}
