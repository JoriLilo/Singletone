package SINGELTONE;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class ComputerGamesAdapter implements PCGame{

    private ComputerGames computerGame;

    public void ComputerGameAdapter(final ComputerGames computerGame) {
        this.computerGame = computerGame;
    }

    public ComputerGamesAdapter(ComputerGames computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (computerGame.getPegiAgeRating()) {
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
        }
        throw new RuntimeException("Unsupported PEGI rating");
    }

    @Override
    public boolean isTripleAGame() {
        return computerGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(computerGame.getMinimumGpuMemoryInMegabytes() / 1024,
                computerGame.getDiskSpaceNeededInGB(),
                computerGame.getRamNeededInGb(),
                computerGame.getCoreSpeedInGhz(),
                computerGame.getCoresNeeded());
    }



}
