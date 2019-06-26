package com.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.xsis.service.BarangService;
import com.xsis.model.Barang;

@Controller
public class BarangController {

	@Autowired
	private BarangService brngsr;
	
	@RequestMapping("/barang")
	public String barang() {
		return ("barang/barang");
	}
	
	@RequestMapping("/listbarang")
	public String listbarang(Model mdl) {
		
		List<Barang> barangs = brngsr.listall();
		
		mdl.addAttribute("keybarang",barangs);
		
		return ("barang/listbarang");
	}
	
	@RequestMapping("/newbarang")
	public String newbarang(Model model) {
		Barang barang=new Barang();
		
		model.addAttribute("barang",barang);
		
		return ("barang/newbarang");
	}
}
