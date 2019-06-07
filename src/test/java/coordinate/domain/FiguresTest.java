package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FiguresTest {
    @Test
    void 점이_두개면_라인() {
        assertThat(Figures.valueOf(2)).isEqualTo(Figures.LINE);
    }

    @Test
    void 점이_세개면_삼각형() {
        assertThat(Figures.valueOf(3)).isEqualTo(Figures.TRIANGLE);
    }

    @Test
    void 점이_네개면_사각형() {
        assertThat(Figures.valueOf(4)).isEqualTo(Figures.RECTANGLE);
    }
}
