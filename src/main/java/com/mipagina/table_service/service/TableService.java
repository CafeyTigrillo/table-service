package com.mipagina.table_service.service;

import com.mipagina.table_service.model.TableLounge;
import com.mipagina.table_service.repository.ITableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService implements ITableService{

    @Autowired
    private ITableRepository tableRepository;

    @Override
    public List<TableLounge> bringAllTable() {
        return tableRepository.findAll();
    }

    @Override
    public void saveTable(TableLounge tableLounge) {
        tableRepository.save(tableLounge);
    }

    @Override
    public TableLounge bringTable(Long idTable) {
        return tableRepository.findById(idTable).orElse(null);
    }

    @Override
    public void updateTable(Long idTable, TableLounge tableLounge) {
        TableLounge tableLounge1 =this.bringTable(idTable);
        tableLounge1.setIdTable(idTable);
        tableLounge1.setTableNumber(tableLounge.getTableNumber());
        tableLounge1.setCapacity(tableLounge.getCapacity());
        tableLounge1.setIdLounge(tableLounge.getIdLounge());
        this.saveTable(tableLounge1);
    }

    @Override
    public void deleteTable(Long idTable) {
        tableRepository.deleteById(idTable);
    }

    @Override
    public List<TableLounge> getTablesByHall(Long idHall) {
        return tableRepository.findTablesByHallId(idHall);
    }
}
