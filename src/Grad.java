import java.util.Objects;

public class Grad {
    int gradId;
    String name;
    int YOP;
    int salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grad grad = (Grad) o;
        return gradId == grad.gradId && YOP == grad.YOP && salary == grad.salary && Objects.equals(name, grad.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradId, name, YOP, salary);
    }

    Grad(int gradId, String name, int YOP, int salary){
        this.gradId = gradId;
        this.name = name;
        this.YOP = YOP;
        this.salary = salary;
    }
}