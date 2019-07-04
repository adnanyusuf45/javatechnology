package com.xsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.MasterTransaction;

public interface MasterTransactionRepo extends JpaRepository<MasterTransaction, Long> {

}
