package org.krams.tutorial.domain;
 
import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * Represents a credit card entity
 * 
 *  @author Krams at {@link http://krams915@blogspot.com}
 */
@Entity
@Table(name = "Creditcard")
public class CreditCard implements Serializable {
 
 private static final long serialVersionUID = 5924361831551833717L;
 
 @Id
 @Column(name = "id")
 @GeneratedValue
 private Integer id;
  
 @Column(name = "type")
 private String type;
  
 @Column(name = "number")
 private String number;
 
 public Integer getId() {
  return id;
 }
 
 public void setId(Integer id) {
  this.id = id;
 }
 
 public String getType() {
  return type;
 }
 
 public void setType(String type) {
  this.type = type;
 }
 
 public String getNumber() {
  return number;
 }
 
 public void setNumber(String number) {
  this.number = number;
 }
}