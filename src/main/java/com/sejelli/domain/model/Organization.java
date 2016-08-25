package com.sejelli.domain.model;

import com.sejelli.domain.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 8/23/2016.
 */
@Entity
public class Organization {

    @Autowired
    @Transient
    private OrganizationRepository repository;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @ManyToOne
    private Organization parent;

    @OneToMany
    @JoinColumn(name="parent_id")
    private List<Organization> childs;

    /**
     * Add Child Organization
     * @param name
     * @return added Child Organization
     */
    public Organization addChildOrganization(String name){
        Organization child = new Organization();
        child.setName(name);
        child.setParent(this);
        return child;
    }

    /**
     * Organization Unique ID
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * The Organization Name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The organization parent id
     */
    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }


    public List<Organization> getChilds() {
        return childs;
    }
}
