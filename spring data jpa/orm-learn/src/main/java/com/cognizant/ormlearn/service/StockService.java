package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	public StockRepository stockRepository;
	
	public List<Stock> getAllStock(String code,int month,int year){
		return stockRepository.findStockByCodeandMonthandYear(code, month, year);
	}

}
