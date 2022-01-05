public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка"); //Ставим точку с запятой чтобы Java понимала, что перечисление закончилось и далее идет другой код
    //new Dog("Собака");
    private String translation;

    Animal(String translation) {  //конструкторы в Enum создаются приватными по-умолчанию, так как нам не нужно создавать объекты класса Animal вне этого класса.
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}
