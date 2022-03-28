package ru.netology.spring.mvc;



import ru.netology.spring.mvc.vaidation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2, message = "name must be minimum two symbols")
    private String name;
    //@NotNull - в данном случае не подходит, т.к. null конвертируется в пустой стринг
    //@NotEmpty(message = "surname is required field") - пропускает как заполенение пробелы
    @NotBlank(message = "surname is required field")
    private String surname;
    private int salary;
    private String department;
    Map<String, String> departments;
    private String carBrand;
    Map<String, String> carBrands;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}", message = "Please pattern xxx-xxx-xx")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "Email must ends with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}

