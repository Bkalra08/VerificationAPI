package com.Verification.VerificationAPI2.Service;

import java.util.Optional;

import com.Verification.VerificationAPI2.Entity.Details;

public interface Servicez {
	
	public Details AddDetails(Details veriDetails);
	public Details GetDetails(long PlaceId);

}
