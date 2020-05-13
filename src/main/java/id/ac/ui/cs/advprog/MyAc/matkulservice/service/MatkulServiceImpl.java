package id.ac.ui.cs.advprog.MyAc.matkulservice.service;

import id.ac.ui.cs.advprog.MyAc.matkulservice.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.matkulservice.repository.MatkulRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MatkulServiceImpl implements MatkulService{

    @Autowired
    private MatkulRepository matkulRepository;

    @Override
    public List<Matkul> findAll() {
        return matkulRepository.findAll();
    }

    @Override
    public Optional<Matkul> findMatkul(String kode) {
        return matkulRepository.findById(kode);
    }

    @Override
    public List<Matkul> findMatkulBySemester(int semester) {
        return matkulRepository.findMatkulBySemester(semester);
    }

    @Override
    public void erase(String kode) {
        matkulRepository.deleteById(kode);
    }

    @Override
    public Matkul rewrite(Matkul matkul) {
        matkulRepository.deleteById(matkul.getKode());
        return matkulRepository.save(matkul);
    }

    @Override
    public Matkul register(Matkul matkul) {
        return matkulRepository.save(matkul);
    }
}
