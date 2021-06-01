package com.rabbitmq.consumer.rabbitmqconsumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foreign_medicine")
public class OneMgMed {

    @Id
    @GeneratedValue
    private  Long id;

    @Column(columnDefinition = "BLOB")
    private byte[] metadata;
}
