package id.ac.ui.cs.advprog.MyAc.matkulservice.controller;

import id.ac.ui.cs.advprog.MyAc.matkulservice.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.matkulservice.service.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/matkul")
public class MatkulController {

    @Autowired
    private MatkulService matkulService;

    @GetMapping
    public ResponseEntity<List<Matkul>> findAll(){
        return null;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Matkul matkul){
        return null;
    }

    @GetMapping("/{kode}")
    public ResponseEntity<Matkul> findById(@PathVariable String kode){
        return null;

    }

    @GetMapping("/semester/{semester}")
    public ResponseEntity<List<Matkul>> findMatkulBySemester(@PathVariable int semester){
        return null;
    }

}