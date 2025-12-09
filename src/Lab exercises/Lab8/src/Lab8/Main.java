package Lab8;

import java.util.ArrayList;
import java.util.List;

class SmartHome
{
    private String name;
    private List<Device>devices;
    public SmartHome(String name)
    {
        setName(name);
        this.devices = new ArrayList<Device>();
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Device addDevice(String id, String type)
    {
        Device newDevice = new Device(id, type);
        devices.add(newDevice);
        SmartHome.Logger.log("Device[id: " + id + ", type: " + type + " was added!");
        return newDevice;
    }
    static class Logger
    {
        public static void log(String message)
        {
            System.out.println("[SmartHome LOG] " + message);
        }
    }
    public void runScenario()
    {
        class ScenarioStep
        {
            private Device device;
            private boolean turnOn;
            public ScenarioStep(Device device, boolean turnOn)
            {
                this.device = device;
                this.turnOn = turnOn;
            }
            public void execute()
            {
                if(turnOn)
                {
                    this.device.turnOn();
                }
                else
                {
                    this.device.turnOff();
                }
                SmartHome.Logger.log("Executing scenario step for device" + device.getId());
            }
        }
        if(devices.size()>=3) {
            ScenarioStep s1 = new ScenarioStep(devices.get(0), true);
            ScenarioStep s2 = new ScenarioStep(devices.get(1), false);
            ScenarioStep s3 = new ScenarioStep(devices.get(2), true);
            s1.execute();
            s2.execute();
            s3.execute();
        }

    }
    public void notifyOnAllDevices(StatusListener listener)
    {
        for(Device device:devices)
        {
            listener.onStatusChange(device.getId(), device.getIsOn());
        }
    }
    class Device
    {
        private String id;
        private String type;
        private boolean isOn;
        public Device(String id, String type)
        {
            setId(id);
            setType(type);
            this.isOn = false;
        }
        public String getId()
        {
            return this.id;
        }
        public String getType()
        {
            return this.type;
        }
        public boolean getIsOn()
        {
            return this.isOn;
        }
        public void setId(String id)
        {
            this.id=id;
        }
        public void setType(String type)
        {
            this.type = type;
        }
        public void turnOn()
        {
            this.isOn = true;
            SmartHome.Logger.log("Device[id: " + id + ", type: " + type + " was turned on!");
        }
        public void turnOff()
        {
            this.isOn = false;
            SmartHome.Logger.log("Device[id: " + id + ", type: " + type + " was turned off!");
        }
        public void printStatus()
        {
            System.out.println("Device [id=" + id + ", type=" + type + ", isOn=" + isOn + "] от SmartHome: " + SmartHome.this.name);
        }
        @Override
        public String toString()
        {
            return "Device[id = " + getId() + ", type: " + getType() + ", isOn: " + getIsOn();
        }
    }

}
public class Main {
    public static void main(String[] args) {
        SmartHome home = new SmartHome("My Smart Home");
        SmartHome.Device lamp = home.addDevice("lamp1", "Light");
        SmartHome.Device ac = home.addDevice("ac1", "Heater");
        SmartHome.Device cam = home.addDevice("cam1", "Camera");
        SmartHome.Device fridge = home.addDevice("fridge1", "Fridge");
        home.runScenario();
        home.notifyOnAllDevices(new StatusListener() {
            @Override
            public void onStatusChange(String deviceId, boolean isOn) {
                System.out.println("Device " + deviceId + " is now " + (isOn ? "ON" : "OFF"));
            }
        });
        lamp.printStatus();
        ac.printStatus();
        cam.printStatus();
        fridge.printStatus();
    }
}
