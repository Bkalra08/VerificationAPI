package com.Verification.VerificationAPI2.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "VerificationOP")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Details {
	
	private long PlaceId;
	private String Img64;
	
	

}
