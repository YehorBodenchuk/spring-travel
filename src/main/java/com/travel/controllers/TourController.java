package com.travel.controllers;

import com.travel.bom.Tour;
import com.travel.services.TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tour")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TourController {

    private final TourService tourService;

    @GetMapping("/")
    public List<Tour> getTours() {
        return tourService.getAll();
    }

    @PostMapping("/")
    public Tour createTour(@RequestBody Tour tour) {
        return tourService.create(tour);
    }

    @DeleteMapping("/{tourId}")
    public void deleteTour(@PathVariable String tourId) {
        tourService.delete(tourId);
    }
}
