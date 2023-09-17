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
@Table(name = "LOANINFO", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Loaninfo.findAll", query = "SELECT l FROM Loaninfo l"),
    @NamedQuery(name = "Loaninfo.findByAccno", query = "SELECT l FROM Loaninfo l WHERE l.accno = :accno"),
    @NamedQuery(name = "Loaninfo.findByFname", query = "SELECT l FROM Loaninfo l WHERE l.fname = :fname"),
    @NamedQuery(name = "Loaninfo.findByEmailid", query = "SELECT l FROM Loaninfo l WHERE l.emailid = :emailid"),
    @NamedQuery(name = "Loaninfo.findByAmount", query = "SELECT l FROM Loaninfo l WHERE l.amount = :amount"),
    @NamedQuery(name = "Loaninfo.findByPassword", query = "SELECT l FROM Loaninfo l WHERE l.password = :password"),
    @NamedQuery(name = "Loaninfo.findByPancardno", query = "SELECT l FROM Loaninfo l WHERE l.pancardno = :pancardno"),
    @NamedQuery(name = "Loaninfo.findByAddress", query = "SELECT l FROM Loaninfo l WHERE l.address = :address"),
    @NamedQuery(name = "Loaninfo.findByStatus", query = "SELECT l FROM Loaninfo l WHERE l.status = :status")})
public class Loaninfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCNO")
    private Integer accno;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "EMAILID")
    private String emailid;
    @Column(name = "AMOUNT")
    private Integer amount;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PANCARDNO")
    private String pancardno;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "STATUS")
    private String status;

    public Loaninfo() {
    }

    public Loaninfo(Integer accno) {
        this.accno = accno;
    }

    public Loaninfo(Integer accno, String fname, String emailid) {
        this.accno = accno;
        this.fname = fname;
        this.emailid = emailid;
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

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        String oldEmailid = this.emailid;
        this.emailid = emailid;
        changeSupport.firePropertyChange("emailid", oldEmailid, emailid);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        Integer oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getPancardno() {
        return pancardno;
    }

    public void setPancardno(String pancardno) {
        String oldPancardno = this.pancardno;
        this.pancardno = pancardno;
        changeSupport.firePropertyChange("pancardno", oldPancardno, pancardno);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
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
        if (!(object instanceof Loaninfo)) {
            return false;
        }
        Loaninfo other = (Loaninfo) object;
        if ((this.accno == null && other.accno != null) || (this.accno != null && !this.accno.equals(other.accno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bankingsys.Loaninfo[ accno=" + accno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
