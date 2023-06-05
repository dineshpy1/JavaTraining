class Subclass extends Parent{
    int subClass;
    public Subclass() {
        this.subClass=123;
        this.parent=567;
        System.out.println(this.subClass+"and"+this.parent);
    }
    public Subclass(int subClass){
        this.subClass=subClass;
        System.out.println(this.subClass);

    }
}
