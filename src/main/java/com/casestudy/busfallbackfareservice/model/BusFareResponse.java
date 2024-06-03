package com.casestudy.busfallbackfareservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusFareResponse {
    private Integer id;
    private Integer fare;
}
