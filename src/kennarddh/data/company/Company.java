package kennarddh.data.company;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null) throw new Exception("Company cannot have a null name");

        this.name = name;
    }

    public class Employee {
        private String name;

        public Company getCompany() {
            return Company.this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) throws Exception {
            if (name == null) throw new Exception("Company cannot have a null name");

            this.name = name;
        }
    }
}
