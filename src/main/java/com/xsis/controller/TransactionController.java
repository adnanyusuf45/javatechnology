package com.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.repository.BarangRepo;
import com.xsis.model.Barang;
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
}
