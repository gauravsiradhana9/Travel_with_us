package com.agency.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agency.entity.Agency;
import com.agency.response.ResponseObj;
import com.agency.service.AgencyService;

@RestController

public class AgencyController {

    private final AgencyService agencyService;

    @Autowired
    public AgencyController(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @PostMapping("/create")
    public Agency addAgency(@RequestBody Agency agency) {
        return agencyService.createAgency(agency);
    }

    @GetMapping("/getAll")
    public List<Agency> getAllAgencies() {
        return agencyService.getAgency();
    }

    @GetMapping("/getOne/{agencyId}")
    public Optional<Agency> getAgencyById(@PathVariable Integer agencyId) {
        return agencyService.getOne(agencyId);
    }

    @DeleteMapping("/deletePack/{agencyId}")
    public ResponseObj delete(@PathVariable Integer agencyId) {
        return agencyService.deleteEmp(agencyId);
    }

    @PutMapping("/update/{agencyId}")
    public ResponseObj updateBooking(@RequestBody Agency book) {
    	return agencyService.updatepack(book);  
    }
}
	


