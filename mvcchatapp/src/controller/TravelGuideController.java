package com.mvc.chat.controller;

import com.mvc.chat.model.TravelPlan;
import com.mvc.chat.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class TravelGuideController {
    @Autowired
    private TravelService travelService;

    @PostMapping("/plan")
    public TravelPlan createPlan(@RequestBody TravelPlan plan) {
        return travelService.savePlan(plan);
    }

    @GetMapping("/{destination}")
    public List<TravelPlan> getTravelPlans(@PathVariable String destination) {
        return travelService.getPlans(destination);
    }
}