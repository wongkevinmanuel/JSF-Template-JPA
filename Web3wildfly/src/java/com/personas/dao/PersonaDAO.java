/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personas.dao;

import com.model.Personas;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jose Manuel
 */
public class PersonaDAO {
    
    final String PERSISTENCE_UNIT_NAME= "Web3wildflyPu";
    @PersistenceContext
    private EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    
    public PersonaDAO() {
            //EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager(); 
    }
    
    public String Guardar(Personas p){
        String mensaje=null;
        try{ 
            em.persist(p); 
            mensaje="Se Guardo Correctamente "+ p.getNombre();
        }catch(Exception e){
            mensaje = e.toString();
            e.printStackTrace();
        }return mensaje;
    } 
}
