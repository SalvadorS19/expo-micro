package com.example.demo.controller;

import com.example.demo.model.Libro;
import com.example.demo.model.LibroSaveDto;
import com.example.demo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public Libro guardarLibro(@RequestBody LibroSaveDto libroSaveDto) {
        return this.libroService.guardarLibro(libroSaveDto);
    }

    @GetMapping
    public List<Libro> getLibros() {
        return this.libroService.getLibros();
    }
}
