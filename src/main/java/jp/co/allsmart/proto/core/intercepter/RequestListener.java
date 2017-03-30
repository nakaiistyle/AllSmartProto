package jp.co.allsmart.proto.core.intercepter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // TODO LogのMDBまわり

    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // TODO LogのMDBまわり

    }

}
