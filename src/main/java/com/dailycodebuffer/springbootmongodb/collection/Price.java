package com.dailycodebuffer.springbootmongodb.collection;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Price {
    private String currency;
    private float amount;
}
