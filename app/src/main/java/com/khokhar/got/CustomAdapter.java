package com.khokhar.got;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Model> my_List;

    public CustomAdapter(List<Model> my_List, Context context) {
        this.my_List = my_List;
        this.context = context;
    }

    Context context;

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int i) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Model model=my_List.get(position);
        holder.title.setText(model.getCharacter_name());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));
//        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "Postion",Toast.LENGTH_LONG).show();
//
//            }
//        });
//
    }

    @Override
    public int getItemCount() {
        return my_List.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView image;
        TextView title;
        private final Context context;




        public MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            image =itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);



        }
        public void onClick(View v) {

            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, Main2Activity.class);
                   intent.putExtra("value", context.getResources().getString(R.string.jon_desciption));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_jon));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_jon));


                    Bundle bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_jon);
                    intent.putExtras(bundle);
                    break;

                case 1:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.dae_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_dae));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_Daenerys));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_daenery);
                    intent.putExtras(bundle);
                    break;

                    case 2:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.cer_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_cer));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_cer));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_cersei);
                    intent.putExtras(bundle);
                    break;

                case 3:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.nite_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_nite));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_nite));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_nightking);
                    intent.putExtras(bundle);
                    break;

                case 4 :
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.tyrion_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_ty));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_tyrion));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_tyrion);
                    intent.putExtras(bundle);
                    break;

                case 5:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.jamie_descrition));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_jamie));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_jamie));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_jamie);
                    intent.putExtras(bundle);
                    break;


                case 6:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.sansa_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_sansa));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_sansa));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_sansa);
                    intent.putExtras(bundle);
                    break;

                case 7:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.arya_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_arya));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_arya));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_arya);
                    intent.putExtras(bundle);
                    break;

                case 8:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.bran_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_bran));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_bran));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_bran);
                    intent.putExtras(bundle);
                    break;

                case 9:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.baelish_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_baelish));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_baelish));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_baelish);
                    intent.putExtras(bundle);
                    break;

                case 10:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.jorah_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_jorah));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_jorah));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_jorah);
                    intent.putExtras(bundle);
                    break;


                default:
                    intent =  new Intent(context, Main2Activity.class);
                    intent.putExtra("value", context.getResources().getString(R.string.theon_description));
                    intent.putExtra("main_name", context.getResources().getString(R.string.m_theon));
                    intent.putExtra("real_name", context.getResources().getString(R.string.r_name_theon));


                    bundle= new Bundle();
                    bundle.putInt("image",R.drawable.m_theon);
                    intent.putExtras(bundle);
                    break;

            }
            context.startActivity(intent);

        }


    }

}
