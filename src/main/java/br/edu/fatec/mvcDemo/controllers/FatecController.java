package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Aluno;
import br.edu.fatec.mvcDemo.models.Fatec;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/fatecs")
public class FatecController {
    private static final List<Fatec>
            fatecs = new ArrayList<Fatec>();

    public FatecController() {
        fatecs.add(new Fatec("Fatec Rubens Lara", "Santos", "ADS, Logística, Informática"));
        fatecs.add(new Fatec("Fatec São Paulo", "São Paulo", "Gestão Empresarial, Análise e Desenvolvimento de Sistemas"));
        fatecs.add(new Fatec("Fatec Campinas", "Campinas", "Redes de Computadores, Eletrônica Industrial, Mecatrônica"));
        fatecs.add(new Fatec("Fatec Sorocaba", "Sorocaba", "Gestão da Tecnologia da Informação, Produção Industrial"));
        fatecs.add(new Fatec("Fatec Taubaté", "Taubaté", "Gestão de Recursos Humanos, Logística, Segurança da Informação"));
    }

    @GetMapping
    public List<Fatec> getFatecs()
    {
        return fatecs;
    }
}
