package com.example.demointegration.repository;

import com.example.demointegration.model.DataIntegration;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DataIntegrationRepository extends CrudRepository<DataIntegration, Long > {
    List<DataIntegration> findByName(String name);

    @Query("SELECT di FROM DataIntegration di where di.integrated = :param")
    Iterable<Object> findDataByIntegration(@Param("param") Boolean param);
}
