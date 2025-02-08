package com.mipagina.table_service.controller;

import com.mipagina.table_service.model.TableLounge;
import com.mipagina.table_service.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tables")
public class TableController {

    @Autowired
    private ITableService tableService;

    @PostMapping("/create")
    public void createTable(@RequestBody TableLounge tableLounge){
        tableService.saveTable(tableLounge);
    }

    @GetMapping("/bring_all")
    public List<TableLounge> getAllTable(){
        return tableService.bringAllTable();
    }

    @GetMapping("/bringTable/{idTable}")
    public TableLounge getTable(@PathVariable Long idTable){
        return tableService.bringTable(idTable);
    }

    @PutMapping("/edit/{idTable}")
    public String editTable(@PathVariable Long idTable,
                            @RequestBody TableLounge tableLounge){
        tableService.updateTable(idTable, tableLounge);
        return "TableLounge edited successfully";
    }

    @DeleteMapping("/delete/{idTable}")
    public String deleteTable(@PathVariable Long idTable){
        tableService.deleteTable(idTable);
        return "TableLounge deleted successfully";
    }

    @GetMapping("/{idHall}")
    public List<TableLounge> getTablesByHall(@PathVariable Long idHall){
        return tableService.getTablesByHall(idHall);
    }
}
