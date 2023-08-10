package com.example.eventsourcing.config;

/*@Configuration
public class AxonAggregateConfig {

    public JpaEventStorageEngine eventStorageEngine(EntityManagerProvider entityManagerProvider,
                                                    TransactionManager transactionManager){
        return new JpaEventStorageEngine(entityManagerProvider, transactionManager);
    }

}*/

import com.example.eventsourcing.account.aggregate.AccountAggregate;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonAggregateConfig {

    @Bean
    EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository(EventStore eventStore){
        EventSourcingRepository<AccountAggregate> repository = EventSourcingRepository.builder(AccountAggregate.class).eventStore(eventStore).build();
        return repository;
    }
}
