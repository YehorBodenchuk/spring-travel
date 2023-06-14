package com.travel.bom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tour {

    private String id;

    private String country;

    private String continent;

    private Float population;

    private Float square;

    private Float averagePrice;

    private String imageUrl;

    private String description;
}
