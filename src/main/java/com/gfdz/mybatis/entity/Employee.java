package com.gfdz.mybatis.entity;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.lastName
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.email
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.d_id
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    private Integer dId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id
     *
     * @return the value of employee.id
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id
     *
     * @param id the value for employee.id
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.lastName
     *
     * @return the value of employee.lastName
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.lastName
     *
     * @param lastname the value for employee.lastName
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.email
     *
     * @return the value of employee.email
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.email
     *
     * @param email the value for employee.email
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.d_id
     *
     * @return the value of employee.d_id
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.d_id
     *
     * @param dId the value for employee.d_id
     *
     * @mbg.generated Wed Dec 06 17:25:17 CST 2017
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }
}