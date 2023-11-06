package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import lotto.PickNumStrategy;
import lotto.dto.LottosDTO;

public class LottoService {
    private Lottos lottos;
    private PickNumStrategy pickNumStrategy;

    public LottoService(PickNumStrategy pickNumStrategy) {
        this.pickNumStrategy = pickNumStrategy;
        this.lottos = new Lottos();
    }

    public LottosDTO createLottos(String money) {
        List<Lotto> createdLottos = createLottoByCnt(toLottoCnt(money));
        return lottosDTO(createdLottos);
    }

    private LottosDTO lottosDTO(List<Lotto> createdLottos) {
        List<List<Integer>> createdLottoNums = new ArrayList<>();
        for (Lotto lotto : createdLottos) {
            createdLottoNums.add(lotto.getNumbers());
        }
        return new LottosDTO(createdLottoNums);
    }

    private List<Lotto> createLottoByCnt(int lottoCnt) {
        List<Lotto> createdLottos = new ArrayList<>();
        for (int i = 0; i < lottoCnt; i++) {
            Lotto createdLotto = lottos.createLotto(pickNumStrategy);
            createdLottos.add(createdLotto);
        }
        return createdLottos;
    }

    private int toLottoCnt(String money) {
        return validate(Integer.parseInt(money)) / 1000;
    }

    private int validate(int money) {
        if (money % 1000 == 0) {
            throw new IllegalArgumentException("로또 구입 금액은 1000원 단위여야 합니다.");
        }
        return money;
    }
}
