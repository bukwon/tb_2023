package ll;

import com.ll.Calc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {

    @Test
    @DisplayName("Calc에 run 메서드는 int를 리턴한다.")
    void t1() {
        int rs = Calc.run("10 + 20");
        }
    @Test
    @DisplayName("10 + 20 = 40")
    void t2 () {
        int rs = Calc.run("10 + 30");

        assertThat(rs).isEqualTo(40);
    }

    @Test
    @DisplayName("10 - 10 = 0")
    void t3() {
        int rs = Calc.run("10 - 10");

        assertThat(rs).isEqualTo(0);
    }

}
