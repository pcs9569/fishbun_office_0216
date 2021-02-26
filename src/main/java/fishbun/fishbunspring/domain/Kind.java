package fishbun.fishbunspring.domain;

public class Kind {
    private Integer kind_id;
    private Integer sto_id;
    private String kind;

    public Integer getKind_id() {
        return kind_id;
    }

    public void setKind_id(Integer kind_id) {
        this.kind_id = kind_id;
    }

    public Integer getSto_id() {
        return sto_id;
    }

    public void setSto_id(Integer sto_id) {
        this.sto_id = sto_id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "kind_id=" + kind_id +
                ", sto_id=" + sto_id +
                ", kind='" + kind + '\'' +
                '}';
    }
}
