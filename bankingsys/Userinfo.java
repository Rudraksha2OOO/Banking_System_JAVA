/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsys;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "USERINFO", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Userinfo.findAll", query = "SELECT u FROM Userinfo u"),
    @NamedQuery(name = "Userinfo.findByAccno", query = "SELECT u FROM Userinfo u WHERE u.accno = :accno"),
    @NamedQuery(name = "Userinfo.findByFname", query = "SELECT u FROM Userinfo u WHERE u.fname = :fname"),
    @NamedQuery(name = "Userinfo.findByLname", query = "SELECT u FROM Userinfo u WHERE u.lname = :lname"),
    @NamedQuery(name = "Userinfo.findByGender", query = "SELECT u FROM Userinfo u WHERE u.gender = :gender"),
    @NamedQuery(name = "Userinfo.findByAge", query = "SELECT u FROM Userinfo u WHERE u.age = :age"),
    @NamedQuery(name = "Userinfo.findByContactno", query = "SELECT u FROM Userinfo u WHERE u.contactno = :contactno"),
    @NamedQuery(name = "Userinfo.findByEmailid", query = "SELECT u FROM Userinfo u WHERE u.emailid = :emailid"),
    @NamedQuery(name = "Userinfo.findByUsername", query = "SELECT u FROM Userinfo u WHERE u.username = :username"),
    @NamedQuery(name = "Userinfo.findByPassword", query = "SELECT u FROM Userinfo u WHERE u.password = :password"),
    @NamedQuery(name = "Userinfo.findByAddress", query = "SELECT u FROM Userinfo u WHERE u.address = :address"),
    @NamedQuery(name = "Userinfo.findByAadharno", query = "SELECT u FROM Userinfo u WHERE u.aadharno = :aadharno"),
    @NamedQuery(name = "Userinfo.findByPancardno", query = "SELECT u FROM Userinfo u WHERE u.pancardno = :pancardno"),
    @NamedQuery(name = "Userinfo.findByAmount", query = "SELECT u FROM Userinfo u WHERE u.amount = :amount")})
public class Userinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ACCNO")
    private Integer accno;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @Column(name = "AGE")
    private int age;
    @Basic(optional = false)
    @Column(name = "CONTACTNO")
    private String contactno;
    @Basic(optional = false)
    @Column(name = "EMAILID")
    private String emailid;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "AADHARNO")
    private String aadharno;
    @Column(name = "PANCARDNO")
    private String pancardno;
    @Basic(optional = false)
    @Column(name = "AMOUNT")
    private int amount;

    public Userinfo() {
    }

    public Userinfo(Integer accno) {
        this.accno = accno;
    }

    public Userinfo(Integer accno, String fname, String lname, String gender, int age, String contactno, String emailid, String username, String password, int amount) {
        this.accno = accno;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
        this.contactno = contactno;
        this.emailid = emailid;
        this.username = username;
        this.password = password;
        this.amount = amount;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        String oldContactno = this.contactno;
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

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        String oldAadharno = this.aadharno;
        this.aadharno = aadharno;
        changeSupport.firePropertyChange("aadharno", oldAadharno, aadharno);
    }

    public String getPancardno() {
        return pancardno;
    }

    public void setPancardno(String pancardno) {
        String oldPancardno = this.pancardno;
        this.pancardno = pancardno;
        changeSupport.firePropertyChange("pancardno", oldPancardno, pancardno);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        int oldAmount = this.amount;
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
        if (!(object instanceof Userinfo)) {
            return false;
        }
        Userinfo other = (Userinfo) object;
        if ((this.accno == null && other.accno != null) || (this.accno != null && !this.accno.equals(other.accno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bankingsys.Userinfo[ accno=" + accno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
