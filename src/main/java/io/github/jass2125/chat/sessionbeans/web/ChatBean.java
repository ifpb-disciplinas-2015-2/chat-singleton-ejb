/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.chat.sessionbeans.web;

import java.util.HashSet;
import java.util.Set;
import javax.ejb.Stateless;

/**
 *
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2015, Feb 8, 2016
 */

@Stateless
public class ChatBean {
    private Set<String> salas = new HashSet<String>();
    
    public void criaSala(String sala){
        this.salas.add(sala);
    }
    
    public void acabaSala(String sala){
        this.salas.remove(sala);
    }
    
    public Set<String> listaSalas(){
        return this.salas;
    }
}
