package com.mipagina.table_service.service;

import com.mipagina.table_service.model.TableLounge;

import java.util.List;

public interface ITableService {

    public void saveTable (TableLounge tableLounge);
    public List<TableLounge> bringAllTable();
    public TableLounge bringTable(Long idTable);
    public void updateTable(Long idTable, TableLounge tableLounge);
    public void deleteTable(Long idTable);

    public List<TableLounge> getTablesByHall(Long idHall);
}
