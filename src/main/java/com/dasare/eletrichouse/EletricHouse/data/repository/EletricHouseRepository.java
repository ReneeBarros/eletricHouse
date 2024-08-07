package com.dasare.eletrichouse.EletricHouse.data.repository;

import com.dasare.eletrichouse.EletricHouse.entity.EletricHouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EletricHouseRepository extends JpaRepository<EletricHouseEntity, Long> {
}

