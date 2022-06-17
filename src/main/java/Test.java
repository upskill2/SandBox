import java.lang.reflect.Array;

public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        test.setField1(new Field("field1"));
        test.setField5(new Field("field5"));
        System.out.println(test.convertToString());
    }

    private Field field1;
    private Field field2;
    private Field field3;
    private Field field4;
    private Field field5;
    private Field field6;
    private Field field7;

    public String convertToString() {
        StringBuilder message = new StringBuilder();

        message.append(field1 != null ? field1.getValue() : "");
        message.append(field2 != null ? field2.getValue() : "");
        message.append(field3 != null ? field3.getValue() : "");
        message.append(field4 != null ? field4.getValue() : "");
        message.append(field5 != null ? field5.getValue() : "");
        message.append(field6 != null ? field6.getValue() : "");
        message.append(field7 != null ? field7.getValue() : "");
        return message.toString();
    }

    public void setField1(Field field1) {
        this.field1 = field1;
    }

    public void setField2(Field field2) {
        this.field2 = field2;
    }

    public void setField3(Field field3) {
        this.field3 = field3;
    }

    public void setField4(Field field4) {
        this.field4 = field4;
    }

    public void setField5(Field field5) {
        this.field5 = field5;
    }

    public void setField6(Field field6) {
        this.field6 = field6;
    }

    public void setField7(Field field7) {
        this.field7 = field7;
    }

    private static class Field {

        public Field(String value) {
            this.value = value;
        }

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}


