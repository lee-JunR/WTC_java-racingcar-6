package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
  @Test
  @DisplayName("Car생성자_사용시_이름_범위가_넘으면_예외발생")
  void Car생성자_사용시_이름_범위가_넘으면_예외발생() {
    String input = "abcdef";

    assertThatThrownBy(() -> new Car(input))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("자동차 이름 형식과 맞지 않습니다.");
  }
  @Test
  @DisplayName("Car_4_이상일_경우_전진")
  void Car_4_이상일_경우_전진(){
    Car car = new Car("jun");
    car.move(4);
    car.move(5);
    car.move(0);
    Assertions.assertEquals(2, car.getPosition());
  }
  @Test
  @DisplayName("Car_4_이상일_경우_전진하지_않음")
  void Car_4_이상일_경우_전진하지_않음(){
    Car car = new Car("jun");
    car.move(1);
    car.move(2);
    car.move(3);
    Assertions.assertEquals(0, car.getPosition());
  }
}
