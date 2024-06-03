package com.casestudy.busfallbackfareservice.controller;

import com.casestudy.busfallbackfareservice.model.BusFareResponse;
import com.casestudy.busfallbackfareservice.service.FareService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buses")
@RequiredArgsConstructor
public class BusFallbackFareController {

    private final FareService fareService;

    @GetMapping("/{id}/fare")
    public ResponseEntity<BusFareResponse> getById(@PathVariable int id) {
        return new ResponseEntity<>(fareService.getByBusId(id), HttpStatus.OK);
    }
}
