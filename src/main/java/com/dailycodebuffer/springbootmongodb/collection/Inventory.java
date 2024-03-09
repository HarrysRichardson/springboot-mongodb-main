package com.dailycodebuffer.springbootmongodb.collection;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Inventory {
    private int total;
    private int available;
    private int reserved;
}
