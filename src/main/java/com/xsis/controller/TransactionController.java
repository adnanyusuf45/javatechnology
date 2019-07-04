package com.xsis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.model.Barang;
import com.xsis.service.BarangService;
import com.xsis.service.MasterTransactionService;
import com.xsis.service.TransactionService;
import com.xsis.viewmodel.TransactionViewModel;
import com.xsis.model.MasterTransaction;

@Controller
public class TransactionController {

	@Autowired
	private BarangService brngsr;
	@Autowired
	private MasterTransactionService mtrtransser;
	@Autowired
	private TransactionService transsr;

	@RequestMapping("/transaction")
	public String transaction() {
		return ("transaction/transaction");
	}

	@RequestMapping("/listbarangtransaction")
	public String listbarang(Model mdl) {

		List<Barang> barangs = brngsr.listall();

		mdl.addAttribute("keybarang", barangs);

		return ("transaction/listtransaction");
	}

	/* simpan new barang */
	@ResponseBody
	@RequestMapping(value = "/savetransaction", method = RequestMethod.POST)
	public Map<String, String> savetransaction(@ModelAttribute("transaction") TransactionViewModel transaction,Model model) {

		System.out.println(transaction);
		
		

		Map<String, String> map = new HashMap<>();

		
		  if (transsr.simpan(transaction)) { 
			  map.put("status", "berhasil");
		  
		  } else 
		  { 
			  map.put("status", "gagal"); 
			  
		  }
		
		/*
		 * MasterTransaction mstrtrans = new MasterTransaction();
		 * mstrtrans.setNamakasir(transaction.getNamakasir());
		 * mstrtrans.setNofaktur(transaction.getNofaktur());
		 * mstrtrans.setTglpenjualan(transaction.getTglpenjualan());
		 * mstrtrans.setTotal(transaction.getTotal());
		 * mstrtrans.setReturncash(transaction.getReturncash());
		 * System.out.println(mstrtrans);
		 * 
		 * 
		 * Map<String, String> map = new HashMap<>();
		 * 
		 * 
		 * if (mtrtransser.simpan(mstrtrans)) { map.put("status", "berhasil");
		 * 
		 * } else { map.put("status", "gagal");
		 * 
		 * }
		 */
		 

		return map;
	}

}
