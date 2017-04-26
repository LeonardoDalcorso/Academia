/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author leona
 */
@Entity
public class Medidas {
    
    @Id
    @GeneratedValue
    private int med_cod;
    
    private String med_dataMendida; //****
    
    private String med_dataProxMedida; //****
    
    @Column(length = 3)
    private double med_peso;
    
    @Column(length = 3)
    private double med_altura;
    
    @Column(length = 3)
    private double med_pescoco;
     
    @Column(length = 3)
    private double med_ombro;
     
    @Column(length = 3)
    private double med_torax;
     
    @Column(length = 3)
    private double med_bicepsDireito;
    
    @Column(length = 3)
    private double med_bicepsEsquerdo;
     
    @Column(length = 3)
    private double med_antiBracoDireito;
     
    @Column(length = 3)
    private double med_antiBracoEsquerdo;
     
    @Column(length = 3)
    private double med_cintura;
     
    @Column(length = 3)
    private double med_adbomen;
     
    @Column(length = 3)
    private double med_quadril;
     
    @Column(length = 3)
    private double med_coxaDireita;
     
    @Column(length = 3)
    private double med_coxaEsquerda;
     
    @Column(length = 3)
    private double med_panturilhaEsquerda;
     
    @Column(length = 3)
    private double med_panturilhaDireita;

  
}
