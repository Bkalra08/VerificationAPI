package com.Verification.VerificationAPI2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Verification.VerificationAPI2.Entity.Details;
import com.Verification.VerificationAPI2.Service.ServiceImpl;

@RestController
public class MainController {
@Autowired 
private ServiceImpl serv;

@PostMapping("/AddDetails")
public Details AddDetails(@RequestBody Details admindetails) {
	return this.serv.AddDetails(admindetails);
}
@GetMapping("/GetData/{PlaceId}")
public Details GetDetails(@PathVariable String PlaceId) {
	return this.serv.GetDetails(Long.parseLong(PlaceId));
}

}
