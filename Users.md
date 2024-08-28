public class Geek {

 private final long id;
    
    private final String content;

    public Geek(long id, String content) {
        super();

        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
public boolean equals(Object o) {
    if(this == o ) return true; // on compare les adresses
    if(o == null || getClass() != o.getClass()) return false; // 
    // Geek obj = (Geek) o;
    Geek p = (Geek) o;
    return id == p.id && content == p.content;
//    content == obj.content;

}

@override
public int hashCode() {
    return Object.hash(id, content);
}

@override
public String toString() {
    //return String.format("{id= %d, content = '%s'}", id, content);
    return "{id: "+ id +" , content: " + content +"}";
}
}
