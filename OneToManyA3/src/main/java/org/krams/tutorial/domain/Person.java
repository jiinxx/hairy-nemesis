package org.krams.tutorial.domain;
 
import java.io.Serializable;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
/**
 * Represents a person entity
 * 
 *  @author Krams at {@link http://krams915@blogspot.com}
 */
@Entity
@Table(name = "Person")
public class Person implements Serializable {
 
 private static final long serialVersionUID = -5527566248002296042L;
  
 @Id
 @Column(name = "id")
 @GeneratedValue
 private Integer id;
  
 @Column(name = "firstname")
 private String firstName;
  
 @Column(name = "lastname")
 private String lastName;
  
 @Column(name = "money")
 private Double money;
 
 @OneToMany
 private Set<CreditCard> creditCards;
  
 public Integer getId() {
  return id;
 }
 
 public void setId(Integer id) {
  this.id = id;
 }
 
 public String getFirstName() {
  return firstName;
 }
 
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 
 public String getLastName() {
  return lastName;
 }
 
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }
 
 public Double getMoney() {
  return money;
 }
 
 public void setMoney(Double money) {
  this.money = money;
 }
 
 public Set<CreditCard> getCreditCards() {
  return creditCards;
 }
 
 public void setCreditCards(Set<CreditCard> creditCards) {
  this.creditCards = creditCards;
 }
}