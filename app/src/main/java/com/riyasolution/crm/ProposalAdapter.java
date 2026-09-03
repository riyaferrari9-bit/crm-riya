package com.riyasolution.crm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProposalAdapter extends RecyclerView.Adapter<ProposalAdapter.ViewHolder> {
    private List<String> items = new ArrayList<>();

    public ProposalAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_proposal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.tvTitle.setText("Propuesta " + (position + 1));
        holder.tvClient.setText("Cliente: Ejemplo");
        holder.tvAmount.setText("$ 1,000.00");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvClient, tvAmount;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvProposalTitle);
            tvClient = itemView.findViewById(R.id.tvProposalClient);
            tvAmount = itemView.findViewById(R.id.tvProposalAmount);
        }
    }
}