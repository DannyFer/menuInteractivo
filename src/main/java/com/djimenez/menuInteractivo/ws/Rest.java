package com.djimenez.menuInteractivo.ws;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.djimenez.menuInteractivo.controlador.impl.ComboControladorImpl;
import com.djimenez.menuInteractivo.controlador.impl.DetalleControladorImpl;
import com.djimenez.menuInteractivo.controlador.impl.IngredienteControladorImpl;
import com.djimenez.menuInteractivo.controlador.impl.PlatilloControladorImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Cliente;
import com.djimenez.menuInteractivo.modelo.entidad.Combo;
import com.djimenez.menuInteractivo.modelo.entidad.Detalle;
import com.djimenez.menuInteractivo.modelo.entidad.Ingrediente;
import com.djimenez.menuInteractivo.modelo.entidad.Platillo;

@RequestScoped
@Path("")
@Produces("application/json")
@Consumes("application/json")
public class Rest {

	private ClienteControladorImpl clienteControladorImp = new ClienteControladorImpl();
	private PlatilloControladorImpl platillosImp = new PlatilloControladorImpl();
	private ComboControladorImpl combosImp = new ComboControladorImpl();
	private IngredienteControladorImpl ingredientesImp = new IngredienteControladorImpl();
	private DetalleControladorImpl detalleControladorImp = new DetalleControladorImpl();
	
	@GET
	@Path("/sesion")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response sesion(@QueryParam("correo") String correo, @QueryParam("contrasenia") String contrasenia) {
		HashMap<Integer, Cliente> hasCliente= new HashMap<>();
		Cliente cliente = new Cliente();
		cliente = clienteControladorImp.buscarPorCorreoCliente(correo);
		hasCliente.put(cliente.getIdCliente(), cliente);
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(hasCliente).build();
	}
	
	@GET
	@Path("/platillos")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response platillos() {
		HashMap<Integer, Platillo> hasPlatillo= new HashMap<>();
		List<Platillo> lista = new ArrayList<>();
		lista=platillosImp.listarPlatillo();
		for(Platillo c : lista) {hasPlatillo.put(c.getIdPlatillo(), c);}
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(hasPlatillo).build();
	}
	
	@GET
	@Path("/combos")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response combos() {
		HashMap<Integer, Combo> hasCombo= new HashMap<>();
		List<Combo> lista = new ArrayList<>();
		lista=combosImp.listarCombo();
		for(Combo c : lista) {hasCombo.put(c.getIdCombo(), c);}
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(hasCombo).build();
	}
	
	@GET
	@Path("/ingredientes")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response ingredientes() {
		HashMap<Integer, Ingrediente> hasIngrediente= new HashMap<>();
		List<Ingrediente> lista = new ArrayList<Ingrediente>();
		lista=ingredientesImp.listarIngrediente();
		for(Ingrediente c : lista) {
			Ingrediente aux = new Ingrediente();
			aux.setIdIngrediente(c.getIdIngrediente());
			aux.setNombre(c.getNombre());
			aux.setDescripcion(c.getDescripcion());
			aux.setPrecio(c.getPrecio());
			aux.setGrafico(c.getGrafico());
			aux.setEstado(c.isEstado());
			aux.setFkCategoria(null);
			hasIngrediente.put(aux.getIdIngrediente(), aux);
		}
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(hasIngrediente).build();
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
		clienteControladorImp.insertarCliente(cliente);
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity("ok").build();
	}
	
	@POST
    @Path("/insertarDetalle")
    @Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
    public Response insertarDetalle(@QueryParam("detalle") JSONObject cli) {
		Detalle detalle = new Detalle();
		detalle.setCantidad((Integer) cli.get("apellido"));
		detalle.setNombre((String) cli.get("apellido"));
		detalle.setPrecio((Double) cli.get("apellido"));
		detalleControladorImp.insertarDetalle(detalle);
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity("ok").build();
		
	}
	
	/*@GET
	@Path("/ingreso")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response sesion(@QueryParam("correo") String correo, @QueryParam("contrasenia") String contrasenia) {		
		Cliente cliente = new Cliente();
		cliente = clienteControladorImp.buscarPorCorreoCliente(correo);
		return Response.ok().header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").status(200)
				.entity(cliente).build();
	}*/
}
