package com.rabbitmq.consumer.rabbitmqconsumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneMgRepository  extends JpaRepository<OneMgMed, Long> {

}
