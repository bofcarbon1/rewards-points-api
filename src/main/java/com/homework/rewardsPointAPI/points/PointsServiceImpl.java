package com.homework.rewardsPointAPI.points;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PointsServiceImpl implements PointsService {

    @Override
    public PointsDTO  calculatePoints(PurchaseDTO purchaseDTO) {
        // Calculate points based on purchase
        boolean pointsEarned = false;
        int pointsTotal = 0;
        // If purchase is greater than or equal to  50 than then points will be earned.
        if (purchaseDTO.getPurchaseAmount() > 49) {
            pointsEarned = true;

            if (purchaseDTO.getPurchaseAmount() > 100) {
                //Add 2 points per dollar over 100
                int diff1 = purchaseDTO.getPurchaseAmount() - 100;
                pointsTotal = pointsTotal + (diff1 * 2);
                System.out.println("pointsTotal: ");
                System.out.println(pointsTotal);
                //Add 1 point for dollars spent between 50 and 100
                int diff2 = (purchaseDTO.getPurchaseAmount() - diff1) - 50;
                pointsTotal = pointsTotal + (diff2 * 1);
                System.out.println("pointsTotal: ");
                System.out.println(pointsTotal);
            } else {
                //Add 1 point for dollars spent between 50 and 100
                int diff3 = purchaseDTO.getPurchaseAmount() - 50;
                pointsTotal = pointsTotal + (diff3 * 1);
                System.out.println("pointsTotal: ");
                System.out.println(pointsTotal);
            }
        }

        System.out.println("pointsEarned: ");
        System.out.println(pointsEarned);

        // Builds the points domain object.
        PointsDTO pointsDTO = new PointsDTO();
        pointsDTO.setPointsEarned(pointsEarned);
        pointsDTO.setPointsTotal(pointsTotal);

        System.out.println("pointsDTO: ");
        System.out.println(pointsDTO);

        return pointsDTO;

    }
}
