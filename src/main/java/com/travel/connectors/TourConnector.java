package com.travel.connectors;

import com.travel.bom.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourConnector extends MongoRepository<Tour, String> {

    Tour getById(String id);
}
