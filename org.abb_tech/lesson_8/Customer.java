package lesson_8;

import java.util.Objects;

public class Customer {

    private Long id;
    private String name;
    private String licenseNumber;

    public Customer(Long id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
