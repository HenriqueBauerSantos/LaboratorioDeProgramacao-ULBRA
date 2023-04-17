package com.example.notas.controller;

import com.example.notas.model.Note;
import com.example.notas.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class NotaController {
    @Autowired
    NotaRepository notaRepository;
    //Recuperar todas as notas
    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return notaRepository.findAll();
    }
    @GetMapping("/notes/{id}")
    public Optional getById(@PathVariable(value = "id") Long id){
        return notaRepository.findById(id);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id){
        Optional<Note> note = notaRepository.findById(id);
        notaRepository.delete(note.get());
        return  ResponseEntity.ok().build();
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") Long id, @Valid @RequestBody Note noteDatails){
        Optional<Note> note = notaRepository.findById(id);
        note.get().setTitle(noteDatails.getTitle());
        note.get().setContent(noteDatails.getContent());
        Note noteResponse = notaRepository.save(note.get());
        return noteResponse;
    }
    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note){
        return notaRepository.save(note);
    }
}
