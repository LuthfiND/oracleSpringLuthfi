package com.example.springOracle.controller;

import com.example.springOracle.model.TransaksiDTO;
import com.example.springOracle.service.TransaksiService;
import com.example.springOracle.utils.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transaksi")
public class TransaksiController {
    @Autowired
    private TransaksiService service;

    @GetMapping("/find-all")
    public RestResult getData(){
        return service.getData();
    }

    @PostMapping("/save-transaksi")
    public RestResult saveTransaksi(@RequestBody TransaksiDTO param){
        return service.saveTransaksi(param);
    }
}
