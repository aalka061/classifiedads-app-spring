package com.classifiedadapp.service;

import java.util.List;

import com.classifiedadapp.model.Advertisement;

public interface IAdvertisementService {

	List<Advertisement> findAll();
	Advertisement addAdvertisement(Advertisement ad);
}
