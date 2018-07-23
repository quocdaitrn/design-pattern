package vn.self.training.designpattern.creational.builder;

public class Person {
    private String name;
    private Integer age;
    private String job;

    public static class Builder {
        private String bName;
        private Integer bAge;
        private String bJob;

        public static Builder create() {
            return new Builder();
        }

        public Builder name(String bName) {
            this.bName = bName;
            return this;
        }

        public Builder age(Integer bAge) {
            this.bAge = bAge;
            return this;
        }

        public Builder job(String bJob) {
            this.bJob = bJob;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        this.name = builder.bName;
        this.age = builder.bAge;
        this.job = builder.bJob;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }
}
