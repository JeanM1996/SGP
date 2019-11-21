/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.jpmosquera.SGP;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jean Paul Mosquera Arevalo
 */
public class Proyecto {
    private String titulo;
    private String periodoAcademico;
    private LocalDate fechaInicio;
    private LocalDate fechaFIn;
    private String objetivos;
    private char estado;
    //Relacion con etiqueta        
    private List<Etiqueta>etiquetas;
    //un proyecto tiene varios componentes
    private List<Componente>componentes;
    private List<Estudiante>estudiante;
}
