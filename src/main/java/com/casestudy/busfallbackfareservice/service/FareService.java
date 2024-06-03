package com.casestudy.busfallbackfareservice.service;

import com.casestudy.busfallbackfareservice.model.BusFareResponse;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FareService {

    private final Map<Integer, Integer> busIdFareMap = Map.of(1, 201,
            2, 202,
            3, 203,
            4, 204,
            5, 205,
            6, 206,
            7, 207,
            8, 208,
            9, 209);

    public BusFareResponse getByBusId(int busId) {
        return BusFareResponse.builder()
                .id(busId)
                .fare(busIdFareMap.get(busId))
                .build();
    }
}
