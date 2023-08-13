package com.cyberclick.restapiv2.repository;

import com.cyberclick.restapiv2.models.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    // Return vendors by name
    List<CloudVendor> findByVendorName(String vendorName);
}
