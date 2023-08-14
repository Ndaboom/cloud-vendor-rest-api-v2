package com.cyberclick.restapiv2.controllers;

import com.cyberclick.restapiv2.models.CloudVendor;
import com.cyberclick.restapiv2.service.CloudVendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(CloudVendorController.class)
class CloudVendorControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CloudVendorService cloudVendorService;
    CloudVendor cloudVendorOne;
    CloudVendor cloudVendorTwo;
    List<CloudVendor> cloudVendorList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        cloudVendorOne = new CloudVendor("1","Google","USA","XXXXXX");
        cloudVendorTwo = new CloudVendor("2","Amazon","USA","YYYYYY");
        cloudVendorList.add(cloudVendorOne);
        cloudVendorList.add(cloudVendorTwo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetCloudVendorDetails() {

    }

    @Test
    void getAllCloudVendorDetails() {
    }

    @Test
    void createCloudVendorDetails() {
    }

    @Test
    void updateCloudVendorDetails() {
    }

    @Test
    void deleteCloudVendorDetails() {
    }
}