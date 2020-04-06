public class Subject {
    private Category category;
    private String url;
    private Priority priority;

    public Subject(Category category, String url, Priority priority) {
        this.category = category;
        this.url = url;
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "category=" + category +
                ", url='" + url + '\'' +
                ", priority=" + priority +
                '}';
    }
}

