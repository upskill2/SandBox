package testtasks;

//1.5 In case of multithreaded fashion, can use synchronized(monitor) or wait/notify
public interface JavaTaskInterface {

    int addNumber(int n);

    int findValue(int target);

}
