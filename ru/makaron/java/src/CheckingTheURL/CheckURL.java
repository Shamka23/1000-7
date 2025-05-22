package CheckingTheURL;

public class CheckURL {
    private static final String[] URLS = {
            "https://javarush.ru",
            "https://google.com",
            "http://wikipedia.org",
            "facebook.com",
            "https://instagram",
            "codegym.cc"
    };

    public static void main(String[] args) {

        for (String url : URLS) {
            boolean protocol = checkProtocol(url);
            boolean domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    private static boolean checkProtocol(String url) {
       return url.startsWith("https");
    }

    private static boolean checkDomain(String url) {
        return url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".ru") || url.endsWith(".net");
    }
}
