package Observer.observer;

/**
 * @author yang
 */
public interface Observer {

    /**
     * 更新观测值
     * @param temp
     * @param humidity
     * @param pressure
     * @return
     */
    public boolean update(float temp,float humidity,float pressure);
}
