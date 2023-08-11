package com.cyberclick.restapiv2.service.impl;

import com.cyberclick.restapiv2.models.CloudVendor;
import com.cyberclick.restapiv2.repository.CloudVendorRepository;
import com.cyberclick.restapiv2.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More logics here
        cloudVendorRepository.save(cloudVendor);
        return "Created successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More logics here
        cloudVendorRepository.save(cloudVendor);
        return "Updated Successfully";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // More logics here
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Record deleted successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // More logics here
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More logics here
        return cloudVendorRepository.findAll();
    }
}
