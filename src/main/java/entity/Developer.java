package entity;

public class Developer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developers.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developers.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developers.specialty
     *
     * @mbg.generated
     */
    private String specialty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developers.salary
     *
     * @mbg.generated
     */
    private Integer salary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developers.id
     *
     * @return the value of developers.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developers.id
     *
     * @param id the value for developers.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developers.name
     *
     * @return the value of developers.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developers.name
     *
     * @param name the value for developers.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developers.specialty
     *
     * @return the value of developers.specialty
     *
     * @mbg.generated
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developers.specialty
     *
     * @param specialty the value for developers.specialty
     *
     * @mbg.generated
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developers.salary
     *
     * @return the value of developers.salary
     *
     * @mbg.generated
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developers.salary
     *
     * @param salary the value for developers.salary
     *
     * @mbg.generated
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}