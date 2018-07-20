package com.example.demointegration.repository;

import com.example.demointegration.model.account.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
