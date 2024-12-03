public class Weather {
    private String name;
    private double windspeed;
    private int rain;
    private boolean israin;
    private boolean issun;
    private boolean iscloud;



    public Weather(String name, double windspeed, int rain, boolean israin, boolean issun, boolean iscloud)
    {
        this.name = name;
        this.windspeed = windspeed;
        this.rain = rain;
        this.israin = israin;
        this.issun = issun;
        this.iscloud = iscloud;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setWindspeed(Double windspeed)
    {
        this.windspeed = windspeed;
    }
    public void setRain(int rain)
    {
        this.rain = rain;
    }
    public void setIsrain(boolean israin)
    {
        this.israin = israin;
    }
    public void setIssun(boolean issun)
    {
        this.issun = issun;
    }
    public void setIscloud(boolean iscloud)
    {
        this.iscloud = iscloud;
    }
    public String getName()
    {
        return name;
    }
    public Double getWindspeed()
    {
        return windspeed;
    }
    public int getRain()
    {
        return rain;
    }
    public boolean getIsrain()
    {
        return israin;
    }
    public boolean getIssun()
    {
        return issun;
    }
    public boolean getIscloud()
    {
        return iscloud;
    }

    public boolean gotowalk()
    {
        if(israin == false && issun == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

