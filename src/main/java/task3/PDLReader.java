package task3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PDLReader {
    @SneakyThrows
    public Company parse(String url) {
        Document doc = Jsoup.connect(url).get();
        String name = doc.title();
        Elements descriptionElements = doc.select("meta[name=description]");
        String description = descriptionElements.isEmpty() ? "" : descriptionElements.attr("content");

        String logoUrl = doc.select("link[rel$=icon]").attr("href");
        if (logoUrl.startsWith("/")) {
            logoUrl = url + logoUrl;
        }

        return new Company(name, description, logoUrl);
    }
}