package br.com.listatelefonica.model.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.listatelefonica.domain.Operadora;
import br.com.listatelefonica.model.service.OperadoraService;

@Path("/operadora")
@Produces({ "application/json" })
public class OperadoraFacade {
	
	@Inject
	private OperadoraService service;
	
	@GET
	@Path("/")
	public List<Operadora> listarTodos() {
		return service.listar();
	}
	@POST
	@Path("/")
	public void salvar(Operadora operadora) {
		service.salvar(operadora);
	}
	@DELETE
	@Path("/{protocolo}")
	public void remover(@PathParam("id") Integer id) {
		service.remover(id);
	}
}