/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsys;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rudraksha
 */
@Entity
@Table(name = "CUSTOMERINFO", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Customerinfo.findAll", query = "SELECT c FROM Customerinfo c"),
    @NamedQuery(name = "Customerinfo.findByAccno", query = "SELECT c FROM Customerinfo c WHERE c.accno = :accno"),
    @NamedQuery(name = "Customerinfo.findByFname", query = "SELECT c FROM Customerinfo c WHERE c.fname = :fname"),
    @NamedQuery(name = "Customerinfo.findByLname", query = "SELECT c FROM Customerinfo c WHERE c.lname = :lname"),
    @NamedQuery(name = "Customerinfo.findByGender", query = "SELECT c FROM Customerinfo c WHERE c.gender = :gender"),
    @NamedQuery(name = "Customerinfo.findByAge", query = "SELECT c FROM Customerinfo c WHERE c.age = :age"),
    @NamedQuery(name = "Customerinfo.findByContactno", query = "SELECT c FROM Customerinfo c WHERE c.contactno = :contactno"),
    @NamedQuery(name = "Customerinfo.findByEmailid", query = "SELECT c FROM Customerinfo c WHERE c.emailid = :emailid"),
    @NamedQuery(name = "Customerinfo.findByUsername", query = "SELECT c FROM Customerinfo c WHERE c.username = :username"),
    @NamedQuery(name = "Customerinfo.findByPassword", query = "SELECT c FROM Customerinfo c WHERE c.password = :password"),
    @NamedQuery(name = "Customerinfo.findByAddress", query = "SELECT c FROM Customerinfo c WHERE c.address = :address"),
    @NamedQuery(name = "Customerinfo.findByAadharno", query = "SELECT c FROM Customerinfo c WHERE c.aadharno = :aadharno"),
    @NamedQuery(name = "Customerinfo.findByPancardno", query = "SELECT c FROM Customerinfo c WHERE c.pancardno = :pancardno"),
    @NamedQuery(name = "Customerinfo.findByAmount", query = "SELECT c FROM Customerinfo c WHERE c.amount = :amount")})
public class Customerinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ACCNO")
    private Integer accno;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "CONTACTNO")
    private Integer contactno;
    @Column(name = "EMAILID")
    private String emailid;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "AADHARNO")
    private BigInteger aadharno;
    @Column(name = "PANCARDNO")
    private BigInteger pancardno;
    @Column(name = "AMOUNT")
    private Integer amount;

    public Customerinfo() {
    }

    public Customerinfo(Integer accno) {
        this.accno = accno;
    }

    public Integer getAccno() {
        return accno;
    }

    public void setAccno(Integer accno) {
        Integer oldAccno = this.accno;
        this.accno = accno;
        changeSupport.firePropertyChange("accno", oldAccno, accno);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Integer oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public Integer getContactno() {
        return contactno;
    }

    public void setContactno(Integer contactno) {
        Integer oldContactno = this.contactno;
        this.contactno = contactno;
        changeSupport.firePropertyChange("contactno", oldContactno, contactno);
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        String oldEmailid = this.emailid;
        this.emailid = emailid;
        changeSupport.firePropertyChange("emailid", oldEmailid, emailid);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public BigInteger getAadharno() {
        return aadharno;
    }

    public void setAadharno(BigInteger aadharno) {
        BigInteger oldAadharno = this.aadharno;
        this.aadharno = aadharno;
        changeSupport.firePropertyChange("aadharno", oldAadharno, aadharno);
    }

    public BigInteger getPancardno() {
        return pancardno;
    }

    public void setPancardno(BigInteger pancardno) {
        BigInteger oldPancardno = this.pancardno;
        this.pancardno = pancardno;
        changeSupport.firePropertyChange("pancardno", oldPancardno, pancardno);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        Integer oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accno != null ? accno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customerinfo)) {
            return false;
        }
        Customerinfo other = (Customerinfo) object;
        if ((this.accno == null && other.accno != null) || (this.accno != null && !this.accno.equals(other.accno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bankingsys.Customerinfo[ accno=" + accno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
