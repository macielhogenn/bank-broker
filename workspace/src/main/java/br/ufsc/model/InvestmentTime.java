package br.ufsc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Maciel Hogenn e Osmar de Oliveira Braz Júnior
 * @since 1.0.0-SNAPSHOT
 */

@AllArgsConstructor
public enum InvestmentTime {

    UNTIL_6_MONTHS(0, 6),
    FROM_6_TO_12_MONTHS(6, 12),
    FROM_12_TO_24_MONTHS(12, 24),
    OVER_24_MONTHS(25, Integer.MAX_VALUE);

    @Getter
    private int min, max;
}
