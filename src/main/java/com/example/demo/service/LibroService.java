package com.example.demo.service;

import com.example.demo.model.Libro;
import com.example.demo.model.LibroSaveDto;
import com.example.demo.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository repository;

    public LibroService(LibroRepository libroRepository) {
        this.repository = libroRepository;
    }

    public Libro guardarLibro(LibroSaveDto libroSaveDto) {
        Libro libro = Libro.builder()
                .titulo(libroSaveDto.titulo())
                .paginas(libroSaveDto.paginas())
                .build();
        return repository.save(libro);
    }

    public List<Libro> getLibros() {
        return repository.findAll();
    }
}
