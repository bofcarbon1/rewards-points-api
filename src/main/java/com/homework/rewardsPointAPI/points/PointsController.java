package com.homework.rewardsPointAPI.points;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 * This class implements a REST API to get purchase reward points
 */

@RestController
@RequestMapping("/points")
public class PointsController {

    @Autowired
    public PointsService pointsService;

    @CrossOrigin(origins = "http://localhost:3000" )
    @GetMapping
    PointsDTO getPointsTest(@RequestParam int purchaseTotal) {
        PurchaseDTO purchaseDTO = new PurchaseDTO( purchaseTotal);
        System.out.println("purchaseDTO: ");
        System.out.println(purchaseDTO);
        PointsDTO pointsDTO = pointsService.calculatePoints(purchaseDTO);
        System.out.println("pointsDTO: ");
        System.out.println(pointsDTO);
        return pointsDTO;
    }

}
