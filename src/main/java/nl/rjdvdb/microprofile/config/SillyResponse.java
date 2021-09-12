package nl.rjdvdb.microprofile.config;

import nl.rjdvdb.persistence.Todo;

import java.util.List;

public class SillyResponse {
    private String config1;
    private List<Todo> todos;

    public SillyResponse(String config1, List<Todo> todos) {
        this.config1 = config1;
        this.todos = todos;
    }

    public String getConfig1() {
        return config1;
    }

    public void setConfig1(String config1) {
        this.config1 = config1;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
