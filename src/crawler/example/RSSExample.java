package crawler.example;

import com.github.abola.crawler.CrawlerPack;

/**
 * RSS也是XML格式的一種類型
 * 
 * 練習取得蘋果新聞提供的RSS
 * 
 * @author Abola Lee
 *
 */
public class RSSExample {
	public static void main(String[] args) {
		
		// 遠端資料路徑
		// >>>Fill here<<< 
		String uri = "http://www.appledaily.com.tw/rss/newcreate/kind/rnews/type/hot";

		System.out.println(
				CrawlerPack.start()
				    .getFromXml(uri)
				    .select("item title")
		);
	}
}
