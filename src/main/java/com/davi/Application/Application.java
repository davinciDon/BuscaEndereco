package com.davi.Application;

import com.davi.service.QueryCep;
import com.davi.service.CreateFile;
import com.davi.service.Address;

import java.util.Scanner;

public class Application {

    public void app() {
        QueryCep queryCep = new QueryCep();
        System.out.println("Digite o cep: ");
        Scanner scanner = new Scanner(System.in);
        String cep = scanner.next();
        Address address = queryCep.getAddress(cep);
        CreateFile createFile = new CreateFile();
        createFile.Create(address);

    }

}
