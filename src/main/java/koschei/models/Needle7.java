package koschei.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Deth8 death8;
    @Autowired
    public void setDeath8(Deth8 death8) {
        this.death8 = death8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death8.toString();
    }
}
