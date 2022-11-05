package com.Verification.VerificationAPI2.DAOLayer;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Verification.VerificationAPI2.Entity.Details;

public interface DaoLayer extends MongoRepository<Details, Long> {
	Details findById(long placeId);
}
