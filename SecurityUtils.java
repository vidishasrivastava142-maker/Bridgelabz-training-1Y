interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8;
    }
}