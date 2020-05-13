package id.ac.ui.cs.advprog.MyAc.matkulservice.controller;

import id.ac.ui.cs.advprog.MyAc.matkulservice.service.MatkulService;
import id.ac.ui.cs.advprog.MyAc.matkulservice.service.MatkulServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(controllers = MatkulController.class)
public class MatkulControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MatkulService matkulService;

    @Test
    public void whenFindAllAccessedThenMustSearchAllMatkul() throws Exception {
        mockMvc.perform(get("/matkul"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }

}
