package com.promo.PromoCode.busniess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.promo.PromoCode.domain.Promo;

@Component
public class PromoCodeBusnessManager {

	public List<Promo> getPromos(){
		List<Promo> promos=new ArrayList<Promo>();
		Promo promo1=new Promo();
		promo1.setComapny("Uber");
		promo1.setPromocode("1234");
			
		Promo promo2=new Promo();
		promo2.setComapny("Careem");
		promo2.setPromocode("12345");
		
		Promo promo3=new Promo();
		promo3.setComapny("Jenny");
		promo3.setPromocode("123456");
		
		promos.add(promo1);
		promos.add(promo2);
		promos.add(promo3);
		
		return promos;
	}
}
