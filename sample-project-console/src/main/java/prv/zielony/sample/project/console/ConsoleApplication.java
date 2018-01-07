package prv.zielony.sample.project.console;

import prv.zielony.sample.project.dao.api.PersistenceId;
import prv.zielony.sample.project.dao.api.Repository;

import java.util.Random;
import java.util.ServiceLoader;

public class ConsoleApplication {

    public static void main(String[] args) {

        Random random = new Random();

        ServiceLoader<Repository> repositoryLoader = ServiceLoader.load(Repository.class);

        if(repositoryLoader.findFirst().isPresent()){
            for(Repository repository : repositoryLoader){
                System.out.println("Repository implementation: " + repository.getClass().getName());
                repository.save(new SampleEntity(random.nextLong()));
                repository.findAll().forEach(System.out::println);
            }
            System.out.println("Repository implementations found: " + repositoryLoader.stream().count());
        } else {
            System.out.println("No Repository implementations found");
        }
    }
}
