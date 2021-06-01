package com.rabbitmq.consumer.rabbitmqconsumer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medicine_list")
public class Medicine {

    @Id
    @GeneratedValue
    private Long id;

    private String manufacturerName;

    private String type;

    private Double price;

    private String name;

    private Integer foreignId;

    private Integer skuId;

    private String packSizeLabel;

    private String rxRequiredHeader;

    private String iconUrl;

    private String slug;

    private String shortComposition;

    private String imageUrl;




}
