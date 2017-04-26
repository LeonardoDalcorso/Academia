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
public class Clientes {
    
    
    
    @Id
    @GeneratedValue
    private Integer cli_cod; 
    
    @Column(length = 40,nullable = false)
    private String cli_nome;
    
    @Column(length = 14, nullable = false, unique = false)
    private String cli_cpf;
    
    @Column(length = 14, nullable = false, unique = false)
    private String cli_rg;
    
    @Column(length = 8)
    private String cli_data_nascimento;
    
    @Column (length = 15, nullable = false)
    private String cli_sexo;
    
    @Column (length = 8, unique = true) //Data do inicio do pagamento 
    private String cli_data_inicioPagamento;

   
  
}
