package com.sejelli.domain.application;

import com.sejelli.domain.model.Organization;
import com.sejelli.domain.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 8/23/2016.
 */
public class OrganizationAppImpl implements OrganizationApp {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationAppImpl addNewOrganization(String name, long parentId) {
        Organization parent = this.organizationRepository.findOne(parentId);
        this.organizationRepository.save(parent.addChildOrganization(name));
        return this;
    }
}
