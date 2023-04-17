package com.example.alunos.controller;

import com.example.alunos.model.Alunos;
import com.example.alunos.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class AlunosController {
    @Autowired
    AlunosRepository alunosRepository;
    //Recuperar todas os alunos
    @GetMapping("/alunos")
    public List<Alunos> getAllNotes(){
        return alunosRepository.findAll();
    }
    @GetMapping("/alunos/{id}")
    public Optional getById(@PathVariable(value = "id") Long id){
        return alunosRepository.findById(id);
    }

    @DeleteMapping("/alunos/{id}")
    public ResponseEntity<?> deleteAluno(@PathVariable(value = "id") Long id){
        Optional<Alunos> aluno = alunosRepository.findById(id);
        alunosRepository.delete(aluno.get());
        return  ResponseEntity.ok().build();
    }

    @PutMapping("/alunos/{id}")
    public Alunos updateAluno(@PathVariable(value = "id") Long id, @Valid @RequestBody Alunos alunoDatails){
        Optional<Alunos> aluno = alunosRepository.findById(id);
        aluno.get().setName(alunoDatails.getName());
        aluno.get().setTeam(alunoDatails.getTeam());
        Alunos alunoResponse = alunosRepository.save(aluno.get());
        return alunoResponse;
    }
    @PostMapping("/alunos")
    public Alunos createAluno(@Valid @RequestBody Alunos aluno){
        return alunosRepository.save(aluno);
    }
}
