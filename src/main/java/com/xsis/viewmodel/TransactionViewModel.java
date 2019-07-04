package com.xsis.viewmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.xsis.model.DetailTransaction;


public class TransactionViewModel {
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name="nofaktur")
	private Long nofaktur;
	
	@Column(name="tglpenjualan")
	private Date tglpenjualan;
	
	@Column(name="namakasir", length = 30)
	private String namakasir;
	
	@Column(name="total")
	private Long total;
	
	@Column(name="returncash")
	private Long returncash;
	
	private List<DetailTransaction>detailtransaction;

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

	public Date getTglpenjualan() {
		return tglpenjualan;
	}

	public void setTglpenjualan(Date tglpenjualan) {
		this.tglpenjualan = tglpenjualan;
	}

	public String getNamakasir() {
		return namakasir;
	}

	public void setNamakasir(String namakasir) {
		this.namakasir = namakasir;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getReturncash() {
		return returncash;
	}

	public void setReturncash(Long returncash) {
		this.returncash = returncash;
	}

	public List<DetailTransaction> getDetailtransaction() {
		return detailtransaction;
	}

	public void setDetailtransaction(List<DetailTransaction> detailtransaction) {
		this.detailtransaction = detailtransaction;
	}

	
	
	
}
