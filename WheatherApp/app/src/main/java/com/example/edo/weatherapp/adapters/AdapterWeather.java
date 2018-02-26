package com.example.edo.weatherapp.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.edo.weatherapp.R;
import com.example.edo.weatherapp.interfaces.WeatherItemClickListener;
import com.example.edo.weatherapp.models.countries_weather.WeatherList;

import java.util.List;

/**
 * Created by Edo on 2/7/2018.
 */

public class AdapterWeather extends RecyclerView.Adapter<AdapterWeather.MyViewHolder> {

    private Context mContext;
    private List<WeatherList>mList;
    private WeatherItemClickListener mListener;
    private LayoutInflater mInflater;

    public AdapterWeather(Context context, List<WeatherList> list, WeatherItemClickListener listener){
        mContext=context;
        mListener=listener;
        mList=list;
        mInflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder=new MyViewHolder(mInflater.inflate(R.layout.row_wheater_county,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (mList != null && !mList.isEmpty()){
            WeatherList currentWeather=mList.get(position);
            holder.countryName.setText(currentWeather.getName());
            holder.weatherDescription.setText(currentWeather.getWeather().get(0).getDescription());
            holder.temperature.setText(String.valueOf(currentWeather.getMain().getTemp()+mContext.getResources().getString(R.string.celsius)));
//            holder.weatherItemBackground.setBackgroundColor(Color.parseColor("#123456"));


//        Glide.with(mContext)
//                .load(currentWeather.getWeather().get(0).getMain())
//                .into(holder.weatherIcon);
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView countryName;
        TextView weatherDescription;
        TextView temperature;
        ImageView weatherIcon;
        RelativeLayout weatherItemBackground;

        public MyViewHolder(View itemView) {
            super(itemView);
            countryName=itemView.findViewById(R.id.country_name);
            weatherDescription=itemView.findViewById(R.id.country_description);
            temperature=itemView.findViewById(R.id.temperature);
            weatherIcon=itemView.findViewById(R.id.weather_icon);
            weatherItemBackground =itemView.findViewById(R.id.weather_background);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mListener.onItemClick(view,getAdapterPosition());
        }
    }
}
