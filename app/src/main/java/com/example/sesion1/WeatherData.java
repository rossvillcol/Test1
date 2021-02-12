package com.example.sesion1;

import java.util.List;

public class WeatherData {
    private WeatherCoord coord;
    private List<Weather> weather;
    private String base;
    private Float visibility;
    private Integer dt;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;
    private WeatherMain main;
    private WeatherWind wind;
    private WeatherClouds clouds;
    private WeatherSys sys;

    public WeatherCoord getCoord() {
        return coord;
    }

    public void setCoord(WeatherCoord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Float getVisibility() {
        return visibility;
    }

    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public WeatherWind getWind() {
        return wind;
    }

    public void setWind(WeatherWind wind) {
        this.wind = wind;
    }

    public WeatherClouds getClouds() {
        return clouds;
    }

    public void setClouds(WeatherClouds clouds) {
        this.clouds = clouds;
    }

    public WeatherSys getSys() {
        return sys;
    }

    public void setSys(WeatherSys sys) {
        this.sys = sys;
    }
}