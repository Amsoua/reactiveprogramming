package rxjava;

import io.reactivex.rxjava3.core.Observable;

public class Grouping {
    public static void main(String[] args) {
        Observable<Employee> source = Observable.just(
                new Employee(102,"Amadou", 100000, 5.0),
                new Employee(123,"John", 92000, 4.0),
                new Employee(113,"Moussa", 89000, 4.1),
                new Employee(201,"Maria", 75000, 3.9),
                new Employee(300,"Jane", 78000, 4.5),
                new Employee(230,"Rick", 56000, 4.5),
                new Employee(231,"Jose", 56000, 4.0),
                new Employee(231,"Rose", 56000, 4.5),
                new Employee(412,"Jimmy", 67000, 4.1)
        );

        source.groupBy(Employee::getRating)
                .flatMapSingle(e -> e.toMultimap(key -> key.getId(), value -> value.getName()))
                .subscribe(System.out::println);
    }
}
