/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.deneme;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Adem
 */
@ManagedBean(name = "indexBean")
@ViewScoped
public class IndexBean {

    private String name;
    private String surname;
    
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void retrieveFromDB(){
        System.out.println("Gelen değer : " + name);
    }
    
}
