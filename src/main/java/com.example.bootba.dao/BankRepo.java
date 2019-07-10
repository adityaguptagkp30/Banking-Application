package com.example.bootba.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.bootba.model.Bank;
public interface BankRepo extends CrudRepository<Bank,Integer>
{

}
