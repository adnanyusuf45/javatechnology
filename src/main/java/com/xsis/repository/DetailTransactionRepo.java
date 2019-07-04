package com.xsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.DetailTransaction;

public interface DetailTransactionRepo extends JpaRepository<DetailTransaction, Long> {

}
