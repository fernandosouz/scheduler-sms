package com.example.demointegration.repository;

import com.example.demointegration.model.DataIntegration;
import com.example.demointegration.model.TokenResponse;
import org.springframework.data.repository.CrudRepository;

public interface TokenResponseRepository extends CrudRepository<TokenResponse, Long > {
}
