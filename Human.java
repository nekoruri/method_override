public interface Human {
    String getName();

    default public int getBirthyear() {
        throw new UnsupportedOperationException();
    }

    default String introduce(int currentYear) {
        return getAge(currentYear) + "歳の" + getName() + "です。";
    }

    default int getAge(int currentYear) {
        return currentYear - this.getBirthyear();
    }
}
