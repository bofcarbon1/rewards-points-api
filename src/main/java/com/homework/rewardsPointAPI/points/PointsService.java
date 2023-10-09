package com.homework.rewardsPointAPI.points;

public interface PointsService {
    /**
     * Calculate points based on purchase.
     *
     * @return the resulting PointsDTO object
     */
    PointsDTO calculatePoints(PurchaseDTO purchaseDTO);
}
