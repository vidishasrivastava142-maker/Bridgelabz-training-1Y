class VotingDemo {

    static int[] ages() {
        return new int[]{12, 18, 20, -5, 25, 16, 30, 10, 45, 17};
    }

    public static void main(String[] args) {
        int[] a = ages();

        System.out.println("Age\tCan Vote");
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 18)
                System.out.println(a[i] + "\ttrue");
            else
                System.out.println(a[i] + "\tfalse");
        }
    }
}
