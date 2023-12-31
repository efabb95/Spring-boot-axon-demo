package com.example.eventsourcing.account.services.command;

import java.util.concurrent.CompletableFuture;

import com.example.eventsourcing.account.services.command.dto.AccountCreateDTO;
import com.example.eventsourcing.account.services.command.dto.MoneyCreditDTO;
import com.example.eventsourcing.account.services.command.dto.MoneyDebitDTO;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
