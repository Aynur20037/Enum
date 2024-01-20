package Test1;

public enum Test1 {
    MONDAY(" Понедельник "),
    TUESDAY(" Вторник "),
    WEDNESDAY(" Среда "),
    THURSDAY(" Четверг "),
    FRIDAY(" Пятница "),
    SATURDAY(" Суббота "),
    SUNDAY(" Воскресенье ");
    private String Days;

    Test1(String days) {
        this.Days = days;
    }

    public String getDays() {
        return Days;
    }

    public void isWeekend() {
        switch (this) {
            case SATURDAY -> System.out.println("Этот день выходной");
            case SUNDAY -> System.out.println("Этот день выходной");

            default -> System.out.println("Этот день не выходной");

        }
    }

}


