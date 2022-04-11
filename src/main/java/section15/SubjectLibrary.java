package section15;

public interface SubjectLibrary {

    void subscribeObserver(OberServer ob);
    void unsubscribeObserver(OberServer ob);
    void notifyObserver();
}
