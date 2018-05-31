package com.example.asus_pc.movies.Genero.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus_pc.movies.Genero.model.Genero;
import com.example.asus_pc.movies.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroAdapter extends RecyclerView.Adapter {

    List<Genero> generoList;
    Context context;

    public GeneroAdapter(List<Genero> groupList, Context context) {
        this.generoList = groupList;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_genero, parent, false);
        return new ViewHolderGroup(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Genero object = generoList.get(position);
        ViewHolderGroup viewHolderGroup = (ViewHolderGroup) holder;
        viewHolderGroup.textViewGroupTitle.setText(object.getGenero());
        viewHolderGroup.textViewGroupTeamName1.setText(object.getTeam1());
        viewHolderGroup.textViewGroupTeamName2.setText(object.getTeam2());
        viewHolderGroup.textViewGroupTeamName3.setText(object.getTeam3());
        viewHolderGroup.textViewGroupTeamName4.setText(object.getTeam4());
        Picasso.get().load(object.getTeam_img1()).into(viewHolderGroup.circleImageViewGroupTeam1);
        Picasso.get().load(object.getTeam_img2()).into(viewHolderGroup.circleImageViewGroupTeam2);
        Picasso.get().load(object.getTeam_img3()).into(viewHolderGroup.circleImageViewGroupTeam3);
        Picasso.get().load(object.getTeam_img4()).into(viewHolderGroup.circleImageViewGroupTeam4);
    }

    @Override
    public int getItemCount() {
        return generoList.size();
    }

    public class ViewHolderGroup extends RecyclerView.ViewHolder {
        TextView textViewGroupTitle, textViewGroupTeamName1, textViewGroupTeamName2, textViewGroupTeamName3, textViewGroupTeamName4;
        CircleImageView circleImageViewGroupTeam1, circleImageViewGroupTeam2, circleImageViewGroupTeam3, circleImageViewGroupTeam4;

        public ViewHolderGroup(View item) {
            super(item);
            textViewGroupTitle = item.findViewById(R.id.id_txv_group_title);
            textViewGroupTeamName1 = item.findViewById(R.id.id_txv_group_teamname1);
            textViewGroupTeamName2 = item.findViewById(R.id.id_txv_group_teamname2);
            textViewGroupTeamName3 = item.findViewById(R.id.id_txv_group_teamname3);
            textViewGroupTeamName4 = item.findViewById(R.id.id_txv_group_teamname4);
            circleImageViewGroupTeam1 = item.findViewById(R.id.id_img_group_team1);
            circleImageViewGroupTeam2 = item.findViewById(R.id.id_img_group_team2);
            circleImageViewGroupTeam3 = item.findViewById(R.id.id_img_group_team3);
            circleImageViewGroupTeam4 = item.findViewById(R.id.id_img_group_team4);
        }
    }
}
