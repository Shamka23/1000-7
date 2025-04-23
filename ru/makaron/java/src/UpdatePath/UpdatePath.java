package UpdatePath;

public class UpdatePath {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String newJDK = "29";
        System.out.println(changePath(path, newJDK));

    }

    public static String changePath(String path, String newJDK) {
        int startIndex = path.indexOf("jdk");
        int endIndex = path.indexOf("/", startIndex);

        return path.substring(0, startIndex + 3) + newJDK + path.substring(endIndex);
    }
}
