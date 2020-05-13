package id.ac.ui.cs.advprog.MyAc.matkulservice.service;

import id.ac.ui.cs.advprog.MyAc.matkulservice.model.Matkul;

import java.util.List;
import java.util.Optional;

public interface MatkulService {

    List<Matkul> findAll();

    Optional<Matkul> findMatkul(String kode);

    List<Matkul> findMatkulBySemester(int semester);

    void erase(String kode); //delete

    Matkul rewrite(Matkul matkul); //update

    Matkul register(Matkul matkul); //create

}
