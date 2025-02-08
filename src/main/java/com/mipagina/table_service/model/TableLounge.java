package com.mipagina.table_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TableLounge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTable;
    private int tableNumber;
    private int capacity;
    private Long idLounge;

    public Long getIdTable() {
        return idTable;
    }

    public void setIdTable(Long idTable) {
        this.idTable = idTable;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Long getIdLounge() {
        return idLounge;
    }

    public void setIdLounge(Long idLounge) {
        this.idLounge = idLounge;
    }

    public TableLounge() {
    }

    public TableLounge(Long idTable, int tableNumber, int capacity, Long idLounge) {
        this.idTable = idTable;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.idLounge = idLounge;
    }
}
