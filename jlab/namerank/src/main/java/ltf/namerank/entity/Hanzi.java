package ltf.namerank.entity;


/**
 * @author ltf
 * @since 5/27/16, 10:29 PM
 */
public class Hanzi {
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getTraditional() {
        return traditional;
    }

    public void setTraditional(String traditional) {
        this.traditional = traditional;
    }

    public String getStrokes() {
        return strokes;
    }

    public void setStrokes(String strokes) {
        this.strokes = strokes;
    }

    public String getWuxing() {
        return wuxing;
    }

    public void setWuxing(String wuxing) {
        this.wuxing = wuxing;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getKword() {
        return kword;
    }

    public void setKword(String kword) {
        this.kword = kword;
    }

    public String getHtmid() {
        return htmid;
    }

    public void setHtmid(String htmid) {
        this.htmid = htmid;
    }

    public String getLuckyornot() {
        return luckyornot;
    }

    public void setLuckyornot(String luckyornot) {
        this.luckyornot = luckyornot;
    }

    private String kword;
    private String htmid;
    private String spell;
    private String traditional;
    private String strokes;
    private String wuxing;
    private String luckyornot;
    private String comment;
    private String info;

    @Override
    public String toString() {
        return kword + "\t" +
                htmid + "\t" +
                spell + "\t" +
                traditional + "\t" +
                strokes + "\t" +
                wuxing + "\t" +
                luckyornot + "\t" +
                comment + "\t" +
                info + "\t";
    }

    public DictItem toDictItem(){
        DictItem_Bm8 item = new DictItem_Bm8();
        item.setZi(kword.trim());
        item.setHtmid(Integer.parseInt(htmid.trim()));
        item.setSpell(spell.trim());
        item.setTraditional(traditional.trim());
        item.setStrokes(Integer.parseInt(strokes.trim()));
        item.setWuxing(wuxing.trim());
        item.setLuckyornot(luckyornot.trim());
        item.setComment(comment!=null?comment.trim():"");
        item.setInfo(info.replaceAll("<br>","\n").trim());
        return item;
    }
}
