/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personas.cont;

import com.model.Personas;
import com.personas.dao.PersonaDAO;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jose Manuel
 */
@Named(value = "personasManagedBean")
@ApplicationScoped
public class PersonasManagedBean {

    /**
     * @return the personas
     */
    public Personas getPersonas() {
        return personas;
    }

    /**
     * Creates a new instance of PersonasManagedBean
     */
    private Personas personas;
    public PersonasManagedBean() {
        this.personas = new Personas();
    }
    public void guardar(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje", "Suceso:"+ new PersonaDAO().Guardar(personas) ));
    }
}
