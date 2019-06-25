package com.xsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.Barang;

public interface BarangRepo extends JpaRepository<Barang, Long> {
	
}
