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
    TodoService todoService;

    @GET
    public List<Todo> list() {
        return todoService.list();
    }

    @POST
    public List<Todo> add(Todo todo) {
        todoService.add(todo);
        return list();
    }

    @DELETE
    @Path("{id}")
    public List<Todo> delete(@PathParam("id") int id) {
        todoService.remove(id);
        return list();
    }

    @DELETE
    public List<Todo> delete() {
        todoService.removeAll();
        return list();
    }

}
