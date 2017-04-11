package br.com.listatelefonica.model.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.listatelefonica.domain.Contato;
import br.com.listatelefonica.model.service.ContatoService;

@Path("/contato")
@Produces({ "application/json" })
public class ContatoFacade {
	
	@Inject
	private ContatoService service;
	
	@GET
	@Path("/")
	public List<Contato> listarTodos() {
		return service.listar();
	}
	@POST
	@Path("/")
	public void salvar(Contato contato) {
		service.salvar(contato);
	}
	@DELETE
	@Path("/{protocolo}")
	public void remover(@PathParam("id") Integer id) {
		service.remover(id);
	}
}