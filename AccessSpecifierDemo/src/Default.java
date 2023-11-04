class RBI {
    public void savings() {
        System.out.println("Savings");
    }
}

class SBI extends RBI {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.savings();
    }
}
