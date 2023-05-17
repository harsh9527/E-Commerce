package com.ecom.service.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.CurrencyConversionBean;
import com.ecom.repository.ConversionRepository;
import com.ecom.service.ConversionService;

@Service
public class ConversionServiceImpl implements ConversionService {

	@Autowired
	private ConversionRepository conversionRepository;
	
	@Override
	public CurrencyConversionBean saveConversionBean(CurrencyConversionBean currencyConversionBean) {
		// TODO Auto-generated method stub
		return conversionRepository.save(currencyConversionBean);
	}

	
	

	@Override
	public void  updateConversionBean(CurrencyConversionBean bean, Long id) {
		
//		List<CurrencyConversionBean> list=new LinkedList<>();
//		list=list.stream().map(b->{
//			if(b.getId()==id)
//			{
//			b.setFrom(bean.getFrom());
//			b.setTo(bean.getTo());
//			b.setConversionMultiple(bean.getConversionMultiple());
//			b.setQuantity(bean.getQuantity());
//			b.setTotalCalculatedAmount(bean.getTotalCalculatedAmount());
//			b.setPort(bean.getPort());
//			}
//			return b;
//		}).collect(Collectors.toList());
		
		
		
	     	conversionRepository.save(bean);
		}
		


	


	@Override
	public List<CurrencyConversionBean> getAllConversion() {
		// TODO Auto-generated method stub
		return conversionRepository.findAll();
	}




	@Override
	public Optional<CurrencyConversionBean> getConversionDetails(Long id) {
		// TODO Auto-generated method stub
	return 	conversionRepository.findById(id);
	
	}




	@Override
	public void deleteConversionBean(Long id) {
		// TODO Auto-generated method stub
		conversionRepository.deleteById(id);
	}

}
