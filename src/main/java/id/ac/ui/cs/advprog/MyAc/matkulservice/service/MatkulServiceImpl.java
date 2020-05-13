package id.ac.ui.cs.advprog.MyAc.matkulservice.service;

import id.ac.ui.cs.advprog.MyAc.matkulservice.model.Matkul;

import java.util.List;
import java.util.Optional;

public class MatkulServiceImpl implements MatkulService{
    @Override
    public List<Matkul> findAll() {
        return null;
    }

    @Override
    public Optional<Matkul> findMatkul(String kode) {
        return Optional.empty();
    }

    @Override
    public List<Matkul> findMatkulBySemester(int semester) {
        return null;
    }

    @Override
    public void erase(String kode) {

    }

    @Override
    public Matkul rewrite(Matkul matkul) {
        return null;
    }

    @Override
    public Matkul register(Matkul matkul) {
        return null;
    }
}
