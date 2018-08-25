package com.classifiedadapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.classifiedadapp.model.Advertisement;
import com.classifiedadapp.model.City;
import com.classifiedadapp.repository.AdvertisementRepository;
import com.classifiedadapp.service.IAdvertisementService;


@Controller
public class AdvertisementController {
	
	@Autowired
	private IAdvertisementService advertisementService;
	
	@RequestMapping("/category_test")
    public String findAds(Model model) {
        
        List<Advertisement> ads = (List<Advertisement>) advertisementService.findAll();
        
        model.addAttribute("advertisements", ads);
        
        return "category_test";
    }
	
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String index(Advertisement advertisement) {
		return "test_1";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String addNewAdvertisement(@Valid Advertisement advertisement, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "test_1";
		}
		if(advertisement != null) {
			advertisementService.addAdvertisement(advertisement);
			model.addAttribute("advertisements", advertisementService.findAll());


		} else {
			advertisementService.addAdvertisement(new Advertisement());
			model.addAttribute("advertisements", advertisementService.findAll());


		}
		return "redirect:category_test";
	}
	
	/*
	@GetMapping(value = "/result")
	public String showAllAds(Model model) {
        List<Advertisement> ads = (List<Advertisement>) advertisementRepository.findAll();
		model.addAttribute("advertisements",ads);

		return "result";
	}*/

	/*@GetMapping("/advertisements")
    public Page<Advertisement> getAdvertisements(Pageable pageable) {
        return advertisementRepository.findAll(pageable);
    }
	
	 @PostMapping("/advertisements")
	    public Advertisement createAdvertisement(@Valid @RequestBody Advertisement advertisement) {
	        return advertisementRepository.save(advertisement);
	    }
*/
	
	

}
