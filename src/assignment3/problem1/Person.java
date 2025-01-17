package assignment3.problem1;


public class Person {


    private final String name;


    private final Job job;

    Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        if (hasJob()) return job.getSalary();
        return 0.0;
    }


    private boolean hasJob() {
        return job != null;
    }


    @Override
    public boolean equals(Object aPerson) {

        if (aPerson == null) return false;
        if (!(aPerson instanceof Person person)) return false;
        return this.name.equals(person.name) && (Double.compare(this.getSalary(), ((Person) aPerson).job.getSalary()) == 0);
    }


}
