package com.genuitec.hibernate;



/**
 * AbstractEchoMessage generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractEchoMessage  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String msg;


    // Constructors

    /** default constructor */
    public AbstractEchoMessage() {
    }

    
    /** full constructor */
    public AbstractEchoMessage(String msg) {
        this.msg = msg;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
   








}