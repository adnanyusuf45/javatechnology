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
import com.xsis.model.MasterTransaction;
import com.xsis.service.BarangService;


@Controller
public class TransactionController {

	@Autowired
	private BarangService brngsr;
	
	@RequestMapping("/transaction")
	public String transaction()
	{
		return("transaction/transaction");
	}
	
	@RequestMapping("/listbarangtransaction")
	public String listbarang(Model mdl) {
		
		List<Barang> barangs = brngsr.listall();
		
		mdl.addAttribute("keybarang",barangs);
		
		return ("transaction/listtransaction");
	}
	
	/* simpan new barang */
	@ResponseBody
	@RequestMapping(value="/savetransaction", method=RequestMethod.POST)
	public Map<String,String> savetransaction(@ModelAttribute("transaksi") MasterTransaction transaksi, Model model) {
		
		
		//brngsr.save(barangs);	
		Map<String,String> map= new HashMap<>();
		
		System.out.println(transaksi);
		System.out.println(transaksi.getNamakasir());
		System.out.println(transaksi.getTglpenjualan());
		System.out.println(transaksi.getNofaktur());
		System.out.println(transaksi.getReturncash());
		/*
		 * if (brngsr.simpan(transaksi)) { map.put("status", "berhasil"); } else {
		 * map.put("status", "gagal"); }
		 */
		
		return map;
	}
	
}
