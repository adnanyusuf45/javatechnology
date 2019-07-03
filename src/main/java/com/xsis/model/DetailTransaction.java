package com.xsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="detailtransaction")
public class DetailTransaction {

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nofaktur")
	private Long nofaktur;
	
	@Column(name="idbarang")
	private Long idbarang;
	
	@Column(name="jml")
	private Long jml;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNofaktur() {
		return nofaktur;
	}

	public void setNofaktur(Long nofaktur) {
		this.nofaktur = nofaktur;
	}

	public Long getIdbarang() {
		return idbarang;
	}

	public void setIdbarang(Long idbarang) {
		this.idbarang = idbarang;
	}

	public Long getJml() {
		return jml;
	}

	public void setJml(Long jml) {
		this.jml = jml;
	}
	
	
}
