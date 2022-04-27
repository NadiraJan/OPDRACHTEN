package be.intecbrussel;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private LocalDate birthDay ;
    private transient Timer heartbeat;


    public Person(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(), 0, 1000);


    }
    private class Heartbeat extends TimerTask {
        public void run(){
            System.out.println("*");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Timer getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Timer heartbeat) {
        this.heartbeat = heartbeat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }


}
