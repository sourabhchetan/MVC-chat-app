package com.mvc.chat.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "travel_plans")
public class TravelPlan {
    @Id
    private String id;
    private String destination;
    private String placesToVisit;
    private String hotels;
    private String budget;

    public TravelPlan() {}

    public TravelPlan(String destination, String placesToVisit, String hotels, String budget) {
        this.destination = destination;
        this.placesToVisit = placesToVisit;
        this.hotels = hotels;
        this.budget = budget;
    }

    public String getDestination() { return destination; }
    public String getPlacesToVisit() { return placesToVisit; }
    public String getHotels() { return hotels; }
    public String getBudget() { return budget; }
}