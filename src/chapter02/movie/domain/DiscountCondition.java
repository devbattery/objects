package chapter02.movie.domain;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
