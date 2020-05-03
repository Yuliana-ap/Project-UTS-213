/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.spring;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.boot.model.CustomSql;

/**
 *
 * @author yulia
 */
@Entity
@Table (name = "Datapenduduk")


public class DataPenduduk implements Serializable {
    @Column(name = "idpenduduk")
    private String IDPenduduk;
    @Column(name = "nama")
    private String Nama;
    @Column(name = "tempatlahir")
    private String Tempatlahir;
    @Column(name = "tanggallahir")
    private String Tanggallahir;
    @Column(name = "alamat")
    private String Alamat;

    public DataPenduduk() {
    }

    public DataPenduduk(String IDPenduduk, String Nama, String Tempatlahir, String Tanggallahir, String Alamat) {
        this.IDPenduduk = IDPenduduk;
        this.Nama = Nama;
        this.Tempatlahir = Tempatlahir;
        this.Tanggallahir = Tanggallahir;
        this.Alamat = Alamat;
    }

    void setIDPenduduk(String penD001) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnama(String joko_suprianto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTempatlahir(String jombang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTanggallahir(String deS1976) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAlamat(String margahayu_no_76_BEKASI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

