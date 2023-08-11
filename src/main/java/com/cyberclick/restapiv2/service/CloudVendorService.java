package com.cyberclick.restapiv2.service;

import com.cyberclick.restapiv2.models.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);

    public CloudVendor getCloudVendor();
    public List<CloudVendor> getAllCloudVendors();
}
