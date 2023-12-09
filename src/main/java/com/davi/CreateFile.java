package com.davi;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public void Create(Address Address) {
        try {
            Gson gson = new GsonBuilder().
                    setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                    setPrettyPrinting().create();
            FileWriter fileWriter = new FileWriter("Address.json");
            fileWriter.write(gson.toJson(Address));
            System.out.println(gson.toJson(Address));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Address invalid");
            throw new RuntimeException(e);
        }

    }
}
