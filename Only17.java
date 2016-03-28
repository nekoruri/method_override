public interface Only17 extends Human {
    default int getAge(int currentYear) {
        return 17;
    }
}
