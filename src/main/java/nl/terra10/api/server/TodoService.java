package nl.terra10.api.server;

import nl.terra10.api.model.Todo;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@ApplicationScoped
public class TodoService {

    private final List<Todo> todoList;

    public TodoService() {
        todoList = new ArrayList<>();
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public boolean add(Todo todo){
        return todoList.add(todo);
    }

    public boolean remove(Todo todo){
        return todoList.remove(todo);
    }
    public boolean remove(String id){
        return todoList.remove(Integer.valueOf(id));
    }
}
