package com.example.demointegration.repository;

import com.example.demointegration.model.DataIntegration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface DataIntegrationRepository extends CrudRepository<DataIntegration, Long > {
    @Query("SELECT di FROM DataIntegration di where di.integrated = :param")
    Iterable<Object> findDataByIntegration(@Param("param") Boolean param);
}
