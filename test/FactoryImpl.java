import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryImpl implements ServiceFactory {
	
	private final ArticleService articleService;
	private final TagService tagService;
	
	@Autowired
	public ServiceFactoryImpl(ArticleService articleService, TagService tagService){
		this.articleService = articleService;
		this.tagService = tagService;
	}
	
	@Override
	public ArticleService getArticleService() {
		return articleService;
	}


	@Override
	public TagService getTagService() {
		return tagService;
	}
}
