package com.touristmgmt.controller;

import com.touristmgmt.model.TouristPlace;
import com.touristmgmt.service.TouristPlaceService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TouristPlaceController.class)
public class TouristPlaceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TouristPlaceService service;

    @Test
    public void testGetAllPlaces() throws Exception {
        TouristPlace place = new TouristPlace();
        place.setId(1);
        place.setName("Charminar");
        place.setType("Monument");
        place.setState("Telangana");
        place.setProductMake("Historical");
        place.setProductPrice(100.0);

        List<TouristPlace> mockPlaces = List.of(place);

        Mockito.when(service.getAllPlaces()).thenReturn(mockPlaces);

        mockMvc.perform(get("/api/places"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Charminar"))
                .andExpect(jsonPath("$[0].productPrice").value(100.0));
    }
}
