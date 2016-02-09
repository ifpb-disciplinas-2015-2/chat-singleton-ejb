/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.chat.sessionbeans.web;

import java.io.IOException;
import java.util.Set;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2015, Feb 8, 2016
 */

@WebServlet (name = "chat", urlPatterns = {"/chat"})
public class ChatMB extends HttpServlet {
    
    @EJB
    private ChatBean chat;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sala = req.getParameter("sala");
        
        if(getSalas().contains(sala)){
            this.remove(sala);
        }else{
            this.add(sala);
        }
        req.getSession().setAttribute("sala", this.getSalas());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
    
    public Set<String> getSalas(){
        return chat.listaSalas();
    }
    
    public void add(String sala){
        chat.criaSala(sala);
    }
    
    public void remove(String sala){
        chat.acabaSala(sala);
    }

}
