package com.example.eventsourcing.account.services;

import com.example.eventsourcing.account.services.query.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}