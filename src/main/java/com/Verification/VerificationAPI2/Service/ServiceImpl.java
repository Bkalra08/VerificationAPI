package com.Verification.VerificationAPI2.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Verification.VerificationAPI2.DAOLayer.DaoLayer;
import com.Verification.VerificationAPI2.Entity.Details;


@Service
public class ServiceImpl implements Servicez {

	@Autowired
	private DaoLayer dlayer;
	@Override
	public Details AddDetails(Details veriDetails) {
		dlayer.save(veriDetails);
		return veriDetails;
	}
	@Override
	public Details GetDetails(long PlaceId) {
		return dlayer.findById(PlaceId);
	}
	
	

	

}
