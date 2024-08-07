package com.dasare.eletrichouse.EletricHouse.data.repository;

import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TomadaRepository extends JpaRepository<CalcularTomadaEntity, Long> {
}
