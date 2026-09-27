package com.ejemplo.construccion.controlador;

import com.ejemplo.construccion.modelo.Construccion;
import com.ejemplo.construccion.modelo.InterfaceGeneral;
import com.ejemplo.construccion.repositories.ConstruccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ConstruccionController {

    @Autowired
    private ConstruccionRepository repo;

    @GetMapping("/peticion1")
    public String peticion1(Model model) {
        String nombresSeparados = repo.getListaObjetos().stream()
                .map(InterfaceGeneral::getNombre)
                .collect(Collectors.joining(", "));

        model.addAttribute("resultado", nombresSeparados);
        return "peticion1";
    }

    @GetMapping("/peticion2")
    public String peticion2(Model model) {
        IntSummaryStatistics stats = repo.getListaObjetos().stream()
                .flatMap(obj -> obj.getListaConstrucciones().stream())
                .mapToInt(Construccion::getDuracionDias)
                .summaryStatistics();

        model.addAttribute("count", stats.getCount());
        model.addAttribute("sum", stats.getSum());
        model.addAttribute("average", stats.getAverage());
        model.addAttribute("min", stats.getMin());
        model.addAttribute("max", stats.getMax());

        return "peticion2";
    }

    @GetMapping("/peticion3")
    public String peticion3(Model model) {
        List<String> tiposConstruccion = repo.getListaObjetos().stream()
                .flatMap(obj -> obj.getListaConstrucciones().stream())
                .map(Construccion::getTipo)
                .collect(Collectors.toList());

        model.addAttribute("tipos", tiposConstruccion);
        return "peticion3";
    }

    @GetMapping("/peticion4")
    public String peticion4(Model model) {
        boolean existeLargaDuracion = repo.getListaObjetos().stream()
                .flatMap(obj -> obj.getListaConstrucciones().stream())
                .anyMatch(c -> c.getDuracionDias() > 300);

        boolean existePanal = repo.getListaObjetos().stream()
                .flatMap(obj -> obj.getListaConstrucciones().stream())
                .anyMatch(c -> c.getTipo().toLowerCase().contains("panal"));

        boolean ningunoCostoCero = repo.getListaObjetos().stream()
                .flatMap(obj -> obj.getListaConstrucciones().stream())
                .noneMatch(c -> c.getCostoEstimado() <= 0);

        model.addAttribute("match1", existeLargaDuracion);
        model.addAttribute("match2", existePanal);
        model.addAttribute("match3", ningunoCostoCero);

        return "peticion4";
    }

    @GetMapping("/peticion5")
    public String peticion5(Model model) {
        Construccion maxConstruccion = repo.getListaObjetos().stream()
                .flatMap(obj -> obj.getListaConstrucciones().stream())
                .max((c1, c2) -> Integer.compare(c1.getDuracionDias(), c2.getDuracionDias()))
                .orElse(null);

        model.addAttribute("mayorConstruccion", maxConstruccion);
        return "peticion5";
    }
}
