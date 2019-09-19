package nl.terra10.api.model;

import java.util.Objects;

public class Todo {
    private String id;
    private String option;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) &&
                Objects.equals(option, todo.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, option);
    }
}
