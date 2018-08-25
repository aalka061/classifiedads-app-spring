package com.classifiedadapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.classifiedadapp.model.Advertisement;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {

}
