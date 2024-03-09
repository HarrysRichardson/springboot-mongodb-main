package com.dailycodebuffer.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products {
    @Id
    private String productId;
    private String name;
    private String brand;
    private String category;
    private String description;
    Price price;
    Inventory inventory;
    List<Attributes> attributes = new ArrayList<>();
}
