public enum Priority {
    LOW (1),
    MEDIUM (2),
    HIGH (3);

    private int level;


    private Priority (int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
