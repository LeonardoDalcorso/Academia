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
public class Usuarios {
    
    @Id
    @GeneratedValue
    private Integer usu_cod;
    
    @Column(length = 30, nullable = false)
    private String  usu_nome;
    
    @Column(length = 12, nullable = false, unique = true)
    private String usu_usuario;
    
    @Column(length = 10, nullable = false)
    private Integer usu_senha;
    
    
    
}
