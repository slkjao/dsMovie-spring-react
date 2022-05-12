import "./style.css";
import Moviestars from "components/Moviestars";

function MovieScore() {
  const score = 3.5;
  const count = 89;

  return (
    <div className="dsmovie-score-container">
      <p className="dsmovie-score-value">
        {score > 0 ? score.toFixed(1) : "-"}
      </p>
      <Moviestars />
      <p className="dsmovie-score-count">{count} avaliações</p>
    </div>
  );
}

export default MovieScore;
