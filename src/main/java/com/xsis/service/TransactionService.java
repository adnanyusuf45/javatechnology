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
public class TransactionService {

	@Autowired
	private MasterTransactionRepo mstrtrans;
	@Autowired
	private DetailTransactionRepo dtltrans;
	
	public boolean simpan(TransactionViewModel transaction)
	{
		try {
			System.out.println(transaction);
			 MasterTransaction mastertransaction = new MasterTransaction();
			 mastertransaction.setNamakasir(transaction.getNamakasir());
			 mastertransaction.setNofaktur(transaction.getNofaktur());
			 mastertransaction.setTglpenjualan(transaction.getTglpenjualan());
			 mastertransaction.setTotal(transaction.getTotal());
			 mastertransaction.setReturncash(transaction.getReturncash());
			 System.out.println(mastertransaction);
			 mstrtrans.save(mastertransaction);
			 
			for (DetailTransaction item : transaction.getDetailtransaction()) {
				DetailTransaction detailtransaction = new DetailTransaction();
				detailtransaction.setIdbarang(item.getIdbarang());
				detailtransaction.setNofaktur(transaction.getNofaktur());
				detailtransaction.setJml(item.getJml());
				System.out.println(detailtransaction);
				dtltrans.save(detailtransaction);
			}
			 
			 
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
}
