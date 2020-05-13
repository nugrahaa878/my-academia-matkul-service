package id.ac.ui.cs.advprog.MyAc.matkulservice.repository;

import id.ac.ui.cs.advprog.MyAc.matkulservice.model.Matkul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatkulRepository extends JpaRepository<Matkul, String> {

    @Query("SELECT m FROM Matkul m WHERE m.semester = :semester")
    List<Matkul> findMatkulBySemester(@Param("semester") int semester);

}
