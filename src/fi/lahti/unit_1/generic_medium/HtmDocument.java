package fi.lahti.unit_1.generic_medium;

public class HtmDocument extends MarkupDocument<String>{

    public HtmDocument(String encoding) {
        super(encoding);
    }

    @Override
    public String getHeader() {
        return "Im HTML Document";
    }

    @Override
    public String getContent() {
        return "Hello Word";
    }


}
