package com.dasare.eletrichouse.EletricHouse.data.repository;

import com.dasare.eletrichouse.EletricHouse.entity.CalcularIluminacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IluminacaoRepository extends JpaRepository<CalcularIluminacaoEntity, Long> {
}
