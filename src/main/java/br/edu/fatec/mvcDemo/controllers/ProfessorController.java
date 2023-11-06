package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Aluno;
import br.edu.fatec.mvcDemo.models.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/professores")
public class ProfessorController {
private static final List<Professor>
    professores = new ArrayList<Professor>();

    public ProfessorController() {
        professores.add(new Professor("Claudio","Engenharia de Software 3","ADS"));
        professores.add(new Professor("Doroteia","Sistemas Operacionais","ADS"));
        professores.add(new Professor("Toinho","Matematica","Logistica"));
    }

    @GetMapping
    public String getProfessores(Model model)
    {
        model.addAttribute("professores",professores);
        return "professores";
    }
}
