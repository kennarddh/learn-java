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
        public enum Level {
            One("Level 1"),
            Two("Level 2"),
            ;

            private final String description;

            Level(String description) {
                this.description = description;
            }

            public String getDescription() {
                return description;
            }
        }

        private String name;

        private Level level = Level.One;

        public Company getCompany() {
            return Company.this;
        }

        public Level getLevel() {
            return level;
        }

        public void setLevel(Level level) {
            this.level = level;
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
