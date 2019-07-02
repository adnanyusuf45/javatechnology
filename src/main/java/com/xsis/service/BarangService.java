package com.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.repository.BarangRepo;
import com.xsis.model.Barang;

@Service
@Transactional
public class BarangService {
	
	@Autowired
	private BarangRepo brng;
	
	public List<Barang> listall(){
		return brng.findAll();
	}
	
	public boolean simpan(Barang barang) {
		try {
			brng.save(barang);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	public boolean hapus(Long id) {
		try {
			brng.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
