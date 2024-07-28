package dio.desafio.agregador.domain.DTO;

public class BookDto {
    private Long id;
    private String title;
    private String author;
    private String image;
    private int pages;
    private int pageReads;
    private boolean finished;
    private Long userId;

    public BookDto(Long id, String title, String author, String image, int pages, int pageReads, boolean finished, Long userId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.image = image;
        this.pages = pages;
        this.pageReads = pageReads;
        this.finished = finished;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPageReads() {
        return pageReads;
    }

    public void setPageReads(int pageReads) {
        this.pageReads = pageReads;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
