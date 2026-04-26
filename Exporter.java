interface Exporter {
    void exportCSV();

    default void exportJSON() {
        System.out.println("Exporting JSON");
    }
}