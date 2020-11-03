package com.toDoList.repository;

import com.toDoList.entity.Tarefa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {

    List<Tarefa> findByActive(boolean status);
}
