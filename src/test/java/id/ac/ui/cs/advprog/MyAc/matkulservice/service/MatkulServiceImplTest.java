package id.ac.ui.cs.advprog.MyAc.matkulservice.service;

import id.ac.ui.cs.advprog.MyAc.matkulservice.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.matkulservice.repository.MatkulRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MatkulServiceImplTest {
    @Mock
    private MatkulRepository matkulRepository;

    @InjectMocks
    private MatkulServiceImpl matkulService;

    private Matkul matkul;


    @BeforeEach
    public void setUp() throws Exception {
        this.matkul = new Matkul("CS1234", "Matkul test", 2, 3, "Lorem ipsum");
    }

    @Test
    public void whenFindAllIsCalledItShouldCallMatkulRepositoryFindAll() {
        matkulService.findAll();
        verify(matkulRepository, times(1)).findAll();
    }

    @Test
    public void whenGetIsCalledItShouldCallMatkulRepositoryFindById() {
        matkulService.findMatkul("CS1234");
        verify(matkulRepository, times(1)).findById("CS1234");
    }

    @Test
    public void whenGetIsCalledItShouldCallMatkulRepositoryFindBySemester() {
        matkulService.findMatkulBySemester(2);
        verify(matkulRepository, times(1)).findMatkulBySemester(2);
    }
}
