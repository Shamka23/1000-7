package UpdatePath;

public class UpdatePath {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String newJdk = "29";
        System.out.println(changePath(path, newJdk));

    }

    private static String changePath(String path, String newJdk) {
        int startIndex = path.indexOf("jdk");
        int endIndex = path.indexOf("/", startIndex);

        return path.substring(0, startIndex + 3) + newJdk + path.substring(endIndex);
    }
}
