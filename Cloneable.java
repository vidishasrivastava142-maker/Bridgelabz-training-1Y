class Student implements Cloneable {
    int id;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}