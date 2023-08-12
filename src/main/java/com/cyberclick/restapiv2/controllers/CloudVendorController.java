package com.cyberclick.restapiv2.controllers;


import com.cyberclick.restapiv2.response.ResponseHandler;
import com.cyberclick.restapiv2.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cyberclick.restapiv2.models.CloudVendor;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return ResponseHandler.responseBuilder("Vendor details", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    @GetMapping()
    public ResponseEntity<Object> getAllCloudVendorDetails(){
        return ResponseHandler.responseBuilder("Vendor list", HttpStatus.OK, cloudVendorService.getAllCloudVendors());
    }

    @PostMapping
    public ResponseEntity<Object> createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return ResponseHandler.responseBuilder("Vendor created", HttpStatus.OK, cloudVendorService.createCloudVendor(cloudVendor));
    }

    @PutMapping()
    public ResponseEntity<Object> updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return ResponseHandler.responseBuilder("Vendor updated", HttpStatus.OK, cloudVendorService.updateCloudVendor(cloudVendor));
    }

    @DeleteMapping("{vendorId}")
    public ResponseEntity<Object> deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return ResponseHandler.responseBuilder("Vendor deleted", HttpStatus.OK, cloudVendorService.deleteCloudVendor(vendorId));
    }
}

