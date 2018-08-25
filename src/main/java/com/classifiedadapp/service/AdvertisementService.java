package com.classifiedadapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classifiedadapp.model.Advertisement;
import com.classifiedadapp.repository.AdvertisementRepository;


@Service
public class AdvertisementService implements IAdvertisementService {

	@Autowired
	private AdvertisementRepository adRepository;
	
	@Override
	public List<Advertisement> findAll() {
		// TODO Auto-generated method stub
		List<Advertisement> ads = (List<Advertisement>) adRepository.findAll();
		return ads;
	}

	@Override
	public Advertisement addAdvertisement(Advertisement ad) {
		// TODO Auto-generated method stub
		return adRepository.save(new Advertisement(ad.getTitle(), ad.getPrice(), ad.getDescription()));
	}

}
