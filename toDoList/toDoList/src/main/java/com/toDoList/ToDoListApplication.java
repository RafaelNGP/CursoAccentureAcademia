package com.toDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
    }
}

/*
lista de tarefas:
> TODO: Atualizar uma tarefa
> TODO: Criar um novo endpoint para que quando receber o request '/{id}/description' listar apenas a descrição.
*/
