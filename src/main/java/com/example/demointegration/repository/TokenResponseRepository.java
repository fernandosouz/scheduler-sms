package com.example.demointegration.repository;

import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.model.TokenResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TokenResponseRepository extends CrudRepository<TokenResponse, Long > {

    @Query(value="SELECT tk.* FROM token_response tk ORDER BY id DESC LIMIT 1", nativeQuery = true)
    TokenResponse findLastOne();
}
