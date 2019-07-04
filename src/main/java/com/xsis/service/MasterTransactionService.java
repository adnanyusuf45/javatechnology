package com.xsis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.DetailTransaction;
import com.xsis.model.MasterTransaction;
import com.xsis.repository.DetailTransactionRepo;
import com.xsis.repository.MasterTransactionRepo;
import com.xsis.viewmodel.TransactionViewModel;

@Service
@Transactional
public class MasterTransactionService {

	@Autowired
	private MasterTransactionRepo mstrtrans;
	
	public boolean simpan(MasterTransaction mastertransaction)
	{
		try {
			mstrtrans.save(mastertransaction);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
}
