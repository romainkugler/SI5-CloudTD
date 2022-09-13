package com.polytech.si5.cloud.td.repository;

import com.polytech.si5.cloud.td.entities.ClickCounterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClickCounterRepository extends JpaRepository<ClickCounterEntity, Long> {
}
