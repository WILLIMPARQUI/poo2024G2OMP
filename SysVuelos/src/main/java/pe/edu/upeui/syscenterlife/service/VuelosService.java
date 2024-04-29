/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeui.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeui.syscenterlife.modelo.Vuelos;

@Service
public class VuelosService {

    List<Vuelos> listaVue = new ArrayList<>();

    public boolean saveEntidad(Vuelos vuelos) {//create
        return this.listaVue.add(vuelos);
    }

    public List<Vuelos> listarEntidad() {//report
        return listaVue;
    }

    public Vuelos buscarVuelos(String dnirucx) {//buscar
        return listaVue.stream()
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Vuelos updateEntidad(Vuelos vuelox) {//Update
        listaVue.stream()
                .findFirst() // Obtener el primer cliente que cumpla con el filtro
                .ifPresent(vuelos
                        -> vuelos.setEmbarque(vuelox.getEmbarque()));
//return this.listaCli.set(index, cliente);
        return null;
    }

    public void deleteRegistEntdad(String dato) {//Delete
        listaVue.remove(listaVue.stream()
                .findFirst().orElse(null));
    }
}
