package net.media.training.designpattern.builder;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 11:31:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private int id;
    private String city;
    private String country;

    public Person(String name, int id, String city, String country) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public static class PersonBuilder {
        private String name;
        private int id;
        private String city;
        private String country;

        public PersonBuilder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return city;
        }

        public PersonBuilder setCountry(String country) {
            this.country = country;
            return country;
        }

        public Person build () {
            return new Person(this);
        }
    }

}
