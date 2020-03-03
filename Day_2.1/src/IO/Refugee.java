package IO;

public class Refugee {
    //id,Year,Country,Population,Refugees,RefPerCap
    private int id;
    private int year;
    private String country;
    private double population;
    private double refugees;
    private double refPerCap;

    public Refugee(int id, int year, String country, double population, double refugees, double refPerCap) {
        this.id = id;
        this.year = year;
        this.country = country;
        this.population = population;
        this.refugees = refugees;
        this.refPerCap = refPerCap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getRefugees() {
        return refugees;
    }

    public void setRefugees(double refugees) {
        this.refugees = refugees;
    }

    public double getRefPerCap() {
        return refPerCap;
    }

    public void setRefPerCap(double refPerCap) {
        this.refPerCap = refPerCap;
    }

    @Override
    public String toString() {
        return "Refugee{" +
                "id=" + id +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", refugees=" + refugees +
                ", refPerCap=" + refPerCap +
                '}';
    }
}

