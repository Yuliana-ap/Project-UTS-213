package com.app.spring;

import org.hibernate.boot.model.source.internal.hbm.CommaSeparatedStringHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
public CommandLineRunner TestInsertDataCommandLineRunnerstatic static {
    DataPenduduk dat = new PendudukData();
    dat.setIDPenduduk("PEND001");
    dat.setnama("JOKO SUPRIANTO");
    dat.setTempatlahir("JOMBANG");
    dat.setTanggallahir("05-DES-1976");
    dat.setAlamat("MARGAHAYU NO 76, BEKASI");
    
    repo.save(cus);
    System.out.println("insert data berhasil");
    
    
}
        
}
