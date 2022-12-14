package com.example.springOracle.service;

import com.example.springOracle.model.Transaksi;
import com.example.springOracle.model.TransaksiDTO;
import com.example.springOracle.repository.TransaksiRepository;
import com.example.springOracle.utils.ManyData;
import com.example.springOracle.utils.RestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransaksiService {
    private final TransaksiRepository repository;

    public RestResult getData(){
        ManyData<Transaksi> result = new ManyData<>(repository.getTransaksi(), Transaksi.class);

        return new RestResult(
                result.getData(),
                result.getMessage(),
                result.getError()
        );
    }

    public RestResult saveTransaksi(TransaksiDTO param){
        ManyData<Transaksi> result = new ManyData<>(repository.saveTransaksi(param), Transaksi.class);

        return new RestResult(
                result.getData(),
                result.getMessage(),
                result.getError()
        );
    }


}
