package com.cyberclick.restapiv2.service.impl;

import com.cyberclick.restapiv2.exception.CloudVendorNotFoundException;
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
        if(cloudVendorRepository.existsById(cloudVendorId)) {
            cloudVendorRepository.deleteById(cloudVendorId);
            return "Record deleted successfully";
        } else{
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
        }
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // More logics here
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More logics here
        return cloudVendorRepository.findAll();
    }

    @Override
    public List<CloudVendor> getByVendorName(String vendorName)
    {
        return cloudVendorRepository.findByVendorName(vendorName);
    }
}
