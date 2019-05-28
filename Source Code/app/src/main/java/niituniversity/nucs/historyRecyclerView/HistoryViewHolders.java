package niituniversity.nucs.historyRecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import niituniversity.nucs.HistorySingleActivity;
import niituniversity.nucs.R;
public class HistoryViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView rideId;
    TextView time;
    HistoryViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        rideId = itemView.findViewById(R.id.rideId);
        time = itemView.findViewById(R.id.time);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), HistorySingleActivity.class);
        Bundle b = new Bundle();
        b.putString("rideId", rideId.getText().toString());
        intent.putExtras(b);
        v.getContext().startActivity(intent);
    }
}