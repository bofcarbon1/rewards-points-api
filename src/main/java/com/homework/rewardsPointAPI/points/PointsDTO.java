package com.homework.rewardsPointAPI.points;

import lombok.*;

/**
 * Points transaction model
 */

@Getter
@Setter
public class PointsDTO {
    int pointsTotal;
    boolean pointsEarned;
}