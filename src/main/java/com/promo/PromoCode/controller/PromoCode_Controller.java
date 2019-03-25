package com.promo.PromoCode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promo.PromoCode.busniess.PromoCodeBusnessManager;
import com.promo.PromoCode.domain.Promo;

@Controller
public class PromoCode_Controller {
	
	  @Autowired
	  PromoCodeBusnessManager bussnes;

	  @RequestMapping(method = RequestMethod.GET, value="/promos")
	  @ResponseBody
	  public List<Promo> getAllPromos() {
		  return bussnes.getPromos();
	  }

}
