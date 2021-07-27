package com.questionario.questionario.repository;

import org.springframework.data.repository.CrudRepository;

import com.questionario.questionario.models.Cadastro;

public interface QuestionarioRepository extends CrudRepository <Cadastro, String> {

}
