package br.com.etecfer.etecfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etecfer.etecfer.entity.Curso;
import br.com.etecfer.etecfer.repository.CursoRepository;

@Service
public class CursoService {

    //Injeção de dependencia para a classe aluno
    @Autowired
    private CursoRepository cursoRepository;

    //Método para salvar um aluno
    public Curso save(Curso curso){
        return cursoRepository.save(curso);
    }

    //Método para listar todos os aluno
    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

    //Método para criar um aluno pelo ID
    public void deleteById(Integer id) {
        cursoRepository.deleteById(id);
    }

    //Método para buscar o aluno pelo ID
    public Curso findById(Integer id){
        return cursoRepository.findById(id).orElse(null);
    }
    
}
