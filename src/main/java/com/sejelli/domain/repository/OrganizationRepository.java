package com.sejelli.domain.repository;

import com.sejelli.domain.model.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 8/23/2016.
 */
@Repository
public interface OrganizationRepository extends PagingAndSortingRepository<Organization, Long>{

}
