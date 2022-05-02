package com.example.demo.service.contract;

import com.example.demo.model.contract.Contract;
import com.example.demo.model.contract.ContractRequestDTO;

public interface ContractService {

    public Contract addContract(ContractRequestDTO contractRequestDTO);
    public Contract getContract(Integer contractId);
    public Contract modifyContract(Integer contractId, Integer contractStatus);
    public Contract modifyContract(Integer contractId, String endDate);
}
