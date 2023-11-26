package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class CreateRandomNumber {

  public static final int MIN_RANDOM_NUMBER = 0;
  public static final int MAX_RANDOM_NUMBER = 9;
  private int randomNumber;

  public int getRandomNumber() {
    randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    return randomNumber;
  }
}
