package lotto.domain;

import java.util.List;

public class WinningLotto {
    private final Lotto winningLotto;
    private final int bonusNumber;
    private final List<Integer> winningNumbers;

    public WinningLotto(List<Integer> winningNumbers, int bonusNumber) {
        validateBonusNumber(winningNumbers, bonusNumber);
        this.winningLotto = new Lotto(winningNumbers);
        this.bonusNumber = bonusNumber;
        this.winningNumbers = winningNumbers;
    }

    public void validateBonusNumber(List<Integer> winningNumbers, int bonus_number) {
        if(winningNumbers.contains(bonus_number)){
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getWinningNumber() {
        return winningNumbers;
    }
    public int getBonusNumber() {
        return bonusNumber;
    }
}