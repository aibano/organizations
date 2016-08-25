package com.sejelli.domain.application;

/**
 * Created by user on 8/23/2016.
 */
public interface OrganizationApp {
    OrganizationApp addNewOrganization(
            String name,
            long parentId
    );
}
