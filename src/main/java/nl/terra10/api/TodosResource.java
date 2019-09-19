package nl.terra10.api;

import nl.terra10.api.model.Todo;
import nl.terra10.api.server.TodoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/todos")
public class TodosResource {

    @Inject
    private TodoService todoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Todo> getAll() {
        return todoService.getTodoList();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Todo> add(Todo todo) {
        todoService.add(todo);
        return todoService.getTodoList();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Todo> remote(Todo todo) {
        todoService.remove(todo);
        return todoService.getTodoList();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Todo> remote(@PathParam("id") String id) {
        todoService.remove(id);
        return todoService.getTodoList();
    }


}
