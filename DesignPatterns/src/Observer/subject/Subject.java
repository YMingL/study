package Observer.subject;

import Observer.observer.Observer;

/**
 * @author yang
 */
public interface Subject {

    /**
     * 注册observer
     * @param observer
     * @return
     */
    public boolean registerObserver(Observer observer);

    /**
     * 移除observer
     * @param observer
     * @return
     */
    public boolean removeObserver(Observer observer);

    /**
     * 通知所有observer
     */
    public void notifyObservers();
}
