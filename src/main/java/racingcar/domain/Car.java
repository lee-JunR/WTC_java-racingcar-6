package racingcar.domain;

public class Car {

  public static final int MAX_NAME_LENGTH = 5;
  public static final int MOVE_CONDITION = 4;
  public static final String NAME_ERROR_MESSAGE = "자동차 이름 형식과 맞지 않습니다.";

  private String name;
  private int position = 0; // inital postion setting

  public Car(String input) {
    validateCarNameLength(input);
    this.name = input;
  }

  private static void validateCarNameLength(String input) {
    if (input.length() > MAX_NAME_LENGTH || input.isEmpty()){
      throw new IllegalArgumentException(NAME_ERROR_MESSAGE);
    }
  }

  public int getPosition() {
    return position;
  }

  public void move(int number) {
    if (checkMoveCondition(number)) {
      ++position;
    }
  }

  private static boolean checkMoveCondition(int number) {
    return number >= MOVE_CONDITION;
  }
}
