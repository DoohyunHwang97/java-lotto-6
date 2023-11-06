package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lotto.PickNumStrategy;

public class Lottos {
    private final ArrayList<Lotto> lottos;

    public Lottos() {
        this.lottos = new ArrayList<>();
    }

    public Lotto createLotto(PickNumStrategy pickNumStrategy) {
        Lotto lotto = new Lotto(makeLottoNums(pickNumStrategy));
        lottos.add(lotto);
        return lotto;
    }

    private List<Integer> makeLottoNums(PickNumStrategy pickNumStrategy) {
        List<Integer> numbers = pickNumStrategy.pickNum();
        Collections.sort(numbers);
        return numbers;
    }
}
