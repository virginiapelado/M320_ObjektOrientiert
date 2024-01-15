import ExploreButton from "../Atoms/ExploreButton";
import HomeButton from "../Atoms/HomeButton";
import Logo from "../Atoms/Logo";
import QuizButton from "../Atoms/QuizButton";
import SearchBar from "../Atoms/SearchBar";
import Filters from "../Organisms/Filters";
import "./style.css";

export default function ExplorePage() {
  return (
    <div className="explore">
      <Logo /> <HomeButton /> <ExploreButton /> <QuizButton /> <SearchBar />
      <Filters />
    </div>
  );
}
