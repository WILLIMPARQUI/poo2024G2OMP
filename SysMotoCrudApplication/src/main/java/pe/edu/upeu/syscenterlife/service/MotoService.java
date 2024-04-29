package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysmotolife.Motos.Moto;

@Service
public class MotoService {

    List<Moto> listaMotos = new ArrayList<>();

    public boolean saveMoto(Moto moto) {
        return this.listaMotos.add(moto);
    }

    public List<Moto> listarMotos() {
        return listaMotos;
    }

    public Moto buscarMoto(String placa) {
        return listaMotos.stream()
                .filter(moto -> moto.getPlaca().equals(placa))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ninguna moto
    }

    public Moto actualizarMoto(Moto moto) {
        listaMotos.stream()
                .filter(m -> m.getPlaca().equals(moto.getPlaca())) // Filtrar por placa
                .findFirst() // Obtener la primera moto que cumpla con el filtro
                .ifPresent(m -> {
                    m.setMarca(moto.getMarca());
                    m.setModelo(moto.getModelo());
                    m.setAnio(moto.getAnio());
                    m.setColor(moto.getColor());
                });
        return buscarMoto(moto.getPlaca());
    }

    public void eliminarMoto(String placa) {
        this.listaMotos.remove(listaMotos.stream()
                .filter(moto -> moto.getPlaca().equals(placa))
                .findFirst().orElse(null));
    }
}