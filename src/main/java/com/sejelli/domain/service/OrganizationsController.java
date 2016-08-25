package com.sejelli.domain.service;

import com.sejelli.domain.application.OrganizationApp;
import com.sejelli.domain.model.Organization;
import com.sejelli.domain.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * Created by user on 8/23/2016.
 */
@RestController
public class OrganizationsController {
    @Autowired
    private OrganizationApp organizationApp;

    @RequestMapping(method = RequestMethod.POST, value = "organizations/{parent_id}/childs")
    public void addChildOrganization(@PathVariable("parent_id") long parentId, @RequestBody OrganizationsController.OrganizationPresentation organizationPresentation){

        this.organizationApp.addNewOrganization(organizationPresentation.getName(), parentId);

    }

    public static class OrganizationPresentation implements Serializable{
        private String name;

        public OrganizationPresentation(){

        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
