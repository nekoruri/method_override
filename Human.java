public interface Human {
    /**
     * 名前を返す。
     */
    default String getName();

    /**
     * 生まれ年を返す。
     */
    default public int getBirthyear() {
        throw new UnsupportedOperationException();
    }

    /**
     * 自己紹介を返す。
     */
    default String introduce(int currentYear) {
        return getAge(currentYear) + "歳の" + getName() + "です。";
    }

    /**
     * 年齢を返す。
     */
    default int getAge(int currentYear) {
        return currentYear - this.getBirthyear();
    }
}
