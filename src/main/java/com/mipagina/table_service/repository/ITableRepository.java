package com.mipagina.table_service.repository;

import com.mipagina.table_service.model.TableLounge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITableRepository extends JpaRepository<TableLounge,Long> {
    @Query("SELECT t FROM TableLounge t WHERE t.idLounge=:id_lounge")
    List<TableLounge> findTablesByHallId(Long id_lounge);
}
