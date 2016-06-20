//Mauricio Calcaño 2016-06-19 / Pharoxs
Describe(make_negative_algorithm) {
    static void SetUpContext() {
        srand(time(0));
    }
    It(should_handle_positive_test) {
        Assert::That(makeNegative(42), Equals(-42));
    }
    It(should_handle_negative_test) {
        Assert::That(makeNegative(-9), Equals(-9));
    }
    It(should_handle_zero_test) {
        Assert::That(makeNegative(0), Equals(0));
    }
    It(should_handle_random_positive_test) {
        int rnd = rand() % 100;
        Assert::That(makeNegative(rnd), Equals(-rnd));
    }
    It(should_handle_random_negative_test) {
        int rnd = -(rand() % 100);
        Assert::That(makeNegative(rnd), Equals(rnd));
    }
};