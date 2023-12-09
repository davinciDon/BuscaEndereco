package com.davi.Application;

import com.davi.QueryCep;
import com.davi.CreateFile;
import com.davi.Address;

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
