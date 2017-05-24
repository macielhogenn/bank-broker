package br.ufsc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Maciel Hogenn e Osmar de Oliveira Braz Júnior
 * @since 1.0.0-SNAPSHOT
 */

@AllArgsConstructor
public enum InvestmentLiquidity {

    IMMEDIATELY(0, 0),
    FROM_1_TO_7_DAYS(1, 7),
    FROM_8_TO_14_DAYS(8, 14),
    OVER_14_DAYS(15, Integer.MAX_VALUE);

    @Getter
    private int min, max;
}
