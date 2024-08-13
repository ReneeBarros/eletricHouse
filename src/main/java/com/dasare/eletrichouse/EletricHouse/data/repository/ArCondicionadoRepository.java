package com.dasare.eletrichouse.EletricHouse.data.repository;

import com.dasare.eletrichouse.EletricHouse.entity.CalcularArCondicionadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArCondicionadoRepository extends JpaRepository<CalcularArCondicionadoEntity, Long> {
}
