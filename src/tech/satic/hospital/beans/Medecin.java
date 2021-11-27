// Package
package tech.satic.hospital.beans;

// Librairie
import java.util.Arrays;
import java.util.Objects;

/**
 * @author Lorince TAWAMBA
 * @since 27/11/2021
 * @version 1.0.0
 */
public class Medecin {
    private String code;
    private String fisrt_name;
    private String second_name;
    private String hospital_name;
    private String speciality;
    private String city;

    public Medecin() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFisrt_name() {
        return fisrt_name;
    }

    public void setFisrt_name(String fisrt_name) {
        this.fisrt_name = fisrt_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medecin medecin = (Medecin) o;
        return Objects.equals(code, medecin.code) && Objects.equals(fisrt_name, medecin.fisrt_name) && Objects.equals(second_name, medecin.second_name) && Objects.equals(hospital_name, medecin.hospital_name) && Objects.equals(speciality, medecin.speciality) && Objects.equals(city, medecin.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, fisrt_name, second_name, hospital_name, speciality, city);
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "code='" + code + '\'' +
                ", fisrt_name='" + fisrt_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", hospital_name='" + hospital_name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
