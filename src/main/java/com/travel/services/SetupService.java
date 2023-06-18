package com.travel.services;

import com.travel.bom.Tour;
import com.travel.bom.User;
import com.travel.connectors.TourConnector;
import com.travel.connectors.UserConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetupService {

    private final TourConnector tourConnector;

    private final UserConnector userConnector;

    public void setup() {
        Tour tour = new Tour();
        User user = new User();

        //First tour
        tour.setContinent("Europe");
        tour.setCountry("France");
        tour.setImageUrl("https://cms-b-assets.familysearch.org/dims4/default/92f0f61/2147483647/strip/true/crop/750x500+0+0/resize/1240x827!/quality/90/?url=https%3A%2F%2Ffamilysearch-brightspot.s3.amazonaws.com%2Fcb%2F2b%2Fab7608ce1f477c824c31846ed2f3%2Feiffel-tower-sunrise.jpg");
        tour.setDescription("Woox Travel is a professional Bootstrap 5 theme HTML CSS layout for your website. You can use this layout for your commercial work.");
        tour.setSquare(450.12f);
        tour.setPopulation(8.66f);
        tour.setAveragePrice(4561321f);

        tourConnector.save(tour);

        //Second tour
        tour.setContinent("Europe");
        tour.setCountry("Switzerland");
        tour.setImageUrl("https://cdn.britannica.com/36/178136-050-7F77D46B/village-Alpine-valley-canton-Saint-Moritz-Engadin.jpg");
        tour.setDescription("Woox Travel is a professional Bootstrap 5 theme HTML CSS layout for your website. You can use this layout for your commercial work.");
        tour.setSquare(120.12f);
        tour.setPopulation(4.66f);
        tour.setAveragePrice(1231231f);

        tourConnector.save(tour);

        //Third tour
        tour.setContinent("Europe");
        tour.setCountry("Ukraine");
        tour.setImageUrl("https://www.state.gov/wp-content/uploads/2018/11/Ukraine-2109x1406.jpg");
        tour.setDescription("Woox Travel is a professional Bootstrap 5 theme HTML CSS layout for your website. You can use this layout for your commercial work.");
        tour.setSquare(603.7f);
        tour.setPopulation(43.7f);
        tour.setAveragePrice(400000f);

        tourConnector.save(tour);
    }
}
