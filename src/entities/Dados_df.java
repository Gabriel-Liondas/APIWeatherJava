package entities;

public class Dados_df {
    public Dados_df(int date, String continent, double wind_kph, double precip_mm, int humidity, int cloud, double feelslike_c, double windchill_c, double heatindex_c, double dewpoint_c, double vis_km, double gust_kph, double uv) {
        this.date = date;
        this.continent = continent;
        this.wind_kph = wind_kph;
        this.precip_mm = precip_mm;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.windchill_c = windchill_c;
        this.heatindex_c = heatindex_c;
        this.dewpoint_c = dewpoint_c;
        this.vis_km = vis_km;
        this.gust_kph = gust_kph;
        this.uv = uv;
    }

    public int date;
     public String continent;
     public double wind_kph;
     public double precip_mm;
     public int humidity;
     public int cloud;
     public double feelslike_c;
     public double windchill_c;
     public double heatindex_c;
     public double dewpoint_c;
     public double vis_km;
     public double gust_kph;
     public double uv;

     public String toDataFrame(){
         return String.format("%d,%s,%.1f,%.1f,%d,%d,%.1f,%.1f,%.1f,%.1f,%.1f,%.1f,%.1f",
         date,
         continent,
         wind_kph,
         precip_mm,
         humidity,
         cloud,
         feelslike_c,
         windchill_c,
         heatindex_c,
         dewpoint_c,
         vis_km,
         gust_kph,
         uv
         );
     }

     date : int
     continent : string
     wind_kph : float
     precip_mm : float
     humidity : int
     cloud : int
     feelslike_c : float
     windchill_c : float
     heatindex_c : float
     dewpoint_c : float
     vis_km : float
     gust_kph : float
     uv : float
}
