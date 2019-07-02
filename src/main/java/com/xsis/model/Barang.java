package com.xsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="barang")
public class Barang {
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="namabarang",nullable=false, length = 50)
	private String namabarang;
	
	@Column(name="jenisbarang", length = 30)
	private String jenisbarang;
	
	@Column(name="kotapembuat", length = 30)
	private String kotapembuat;
	
	@Column(name="jmlbarang")
	private int jmlbarang;
	
	@Column(name="hargabarang")
	private int hargabarang;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamabarang() {
		return namabarang;
	}

	public void setNamabarang(String namabarang) {
		this.namabarang = namabarang;
	}

	public String getJenisbarang() {
		return jenisbarang;
	}

	public void setJenisbarang(String jenisbarang) {
		this.jenisbarang = jenisbarang;
	}

	public String getKotapembuat() {
		return kotapembuat;
	}

	public void setKotapembuat(String kotapembuat) {
		this.kotapembuat = kotapembuat;
	}

	public int getJmlbarang() {
		return jmlbarang;
	}

	public void setJmlbarang(int jmlbarang) {
		this.jmlbarang = jmlbarang;
	}

	public int getHargabarang() {
		return hargabarang;
	}

	public void setHargabarang(int hargabarang) {
		this.hargabarang = hargabarang;
	}



}
