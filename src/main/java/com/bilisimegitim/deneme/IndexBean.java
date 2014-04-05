/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.deneme;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Adem
 */
@ManagedBean(name="indexBean")
@ViewScoped
public class IndexBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void retrieveFormDB() {
        System.out.println("Gelen değer : " + name);
    }
    
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }
    
}
