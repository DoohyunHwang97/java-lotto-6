package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class PickNumStrategyImpl implements PickNumStrategy{
    public List<Integer> pickNum() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
