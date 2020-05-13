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
        return new ResponseEntity<>(matkulService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Matkul matkul){
        matkulService.register(matkul);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{kode}")
    public ResponseEntity<Matkul> findById(@PathVariable String kode){
        Optional<Matkul> optionalMatkul = matkulService.findMatkul(kode);

        if(!optionalMatkul.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Matkul>(optionalMatkul.get(),HttpStatus.OK);

    }

    @GetMapping("/semester/{semester}")
    public ResponseEntity<List<Matkul>> findMatkulBySemester(@PathVariable int semester){
        List<Matkul> listMatkul = matkulService.findMatkulBySemester(semester);

        if(listMatkul.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(listMatkul, HttpStatus.OK);

    }

}