package sda.DependencyInversion.Phone;

public interface AudioInput {

    //Napisz aplikację realizującą funkcjonalność wzorca projektowego serwer abstrakcyjny na podstawie następujące problemu:
    //nasz telefon komórkowy steruje telewizorem, chcielibyśmy by w przyszłości ten sam telefon mógł sterować np. soundbarem,
    // zaproponuj rozwiązanie dla tego wymagania.
    //Telefon komórkowy powinien móc:
    //- włączyć odbiornik
    //- wyłączyć odbiornik
    //- zwiększyć poziom głośności
    //- zmniejszyć poziom głośności

    void turnOn();
    void turnOff();
    void volumeUp();
    void volumeDown();
    int volumeLevel();
    boolean isTurnedOn();
}