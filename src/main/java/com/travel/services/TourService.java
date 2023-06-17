package com.travel.services;

import com.travel.bom.Tour;
import com.travel.connectors.TourConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TourService {

    private final TourConnector tourConnector;

    public List<Tour> getAll() {
        return tourConnector.findAll();
    }

    public Tour create(Tour tour) {
        return tourConnector.save(tour);
    }

    public void delete(String tourId) {
        Tour tourToDelete = tourConnector.getById(tourId);
        tourConnector.delete(tourToDelete);
    }
}
