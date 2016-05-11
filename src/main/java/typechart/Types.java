package typechart;

import java.util.HashMap;
import java.util.Map;

public final class Types {
    private static final Map<String, String> types = new HashMap<String, String>();

    private Types() {

    }

    static {
        types.put("normal",
                "Normal type Pokemon are weak against fighting moves and are immune to ghost moves. " +
                        "Normal type moves are weak to rock and steel Pokemon, and they do not " +
                        "effect ghost Pokemon.");
        types.put("water",
                "Water type Pokemon are weak against electric and grass moves.  " +
                        "Water type moves are good against ground, rock, and fire Pokemon.  " +
                        "Water type moves are weak to water, grass, and dragon Pokemon.");
        types.put("grass",
                "Grass type Pokemon are weak against fire, poison, ice, and bug moves. " +
                        "Grass type moves are good against water, rock, and ground Pokemon. " +
                        "Grass type moves are weak against grass, fire, poison, bug, dragon, and steel Pokemon.");
        types.put("fire",
                "Fire type Pokemon are weak against water, ground, and rock moves. " +
                        "Fire type moves are good against grass, steel, and ice Pokemon. " +
                        "Fire type moves are weak against fire, water, rock, and dragon Pokemon.");
        types.put("fighting",
                "Fighting type Pokemon are weak against flying, fairy, and psychic moves. " +
                        "Fighting type moves are good against rock, steel, and dark Pokemon. " +
                        "Fighting type moves are weak against psychic, fairy, flying, bug, and poison Pokemon, " +
                        "and they do not effect ghost Pokemon.");
        types.put("ghost",
                "Ghost type Pokemon are weak against ghost and dark type moves, and they are immune " +
                        "to normal and fighting type moves. " +
                        "Ghost type moves are good against ghost and psychic Pokemon. " +
                        "Ghost type moves are weak against dark and fairy Pokemon, and they do not " +
                        "effect normal Pokemon.");
        types.put("dark",
                "Dark type Pokemon are weak against fighting, bug, and fairy type moves, and they are immune " +
                        "to psychic type moves. " +
                        "Dark type moves are good against psychic and ghost Pokemon. " +
                        "Dark type moves are weak against dark, fairy, and fighting Pokemon.");
        types.put("psychic",
                "Psychic type Pokemon are weak against dark, ghost, and bug type moves. " +
                        "Psychic type moves are good against poison and fighting Pokemon. " +
                        "Psychic type moves are weak against psychic and steel Pokemon, and they do not " +
                        "effect dark Pokemon.");
        types.put("bug",
                "Bug type Pokemon are weak against fire, flying, poison, and rock type moves. " +
                        "Bug type moves are good against grass, psychic and dark Pokemon. " +
                        "Bug type moves are weak against bug, poison, fire, flying, steel, rock, and ghost Pokemon.");
        types.put("poison",
                "Poison type Pokemon are weak against psychic and ground type moves. " +
                        "Poison type moves are good against grass and fairy Pokemon. " +
                        "Poison type moves are weak against rock, and ghost Pokemon, and they do not " +
                        "effect steel Pokemon.")
        types.put("electric",
                "Electric Pokemon are weak against ground moves. " +
                        "Electric type moves are good against flying and water Pokemon. " +
                        "Electric type moves are weak against grass and dragon type Pokemon, and they do not " +
                        "effect ground Pokemon.");
        types.put("ice",
                "Ice type Pokemon are weak against fighting, rock, and steel moves. " +
                        "Ice type moves are good against dragon, flying, ground, and grass Pokemon. " +
                        "Ice type moves are weak against ice, steel, fire, and water Pokemon.");
        types.put("flying",
                "Flying type Pokemon are weak against electric, rock, and ice type moves, and they are " +
                        "immune to ground type moves. " +
                        "Flying type moves are good against grass and bug Pokemon. " +
                        "Flying type moves are weak against electric, rock, and steel Pokemon.");
        types.put("dragon",
                "Dragon type Pokemon are weak against dragon, ice, and fairy moves. " +
                        "Dragon type moves are good against dragon Pokemon. " +
                        "Dragon type moves are weak against steel Pokemon, and they do not " +
                        "effect fairy Pokemon.");
        types.put("ground",
                "Ground type Pokemon are weak to grass, water, and ice moves, and they are immune to " +
                        "electric type moves. " +
                        "Ground type moves are good against fire, rock, steel, poison, and electric Pokemon. " +
                        "Ground type moves are weak against grass Pokemon, and they do not effect " +
                        "flying Pokemon.");
        types.put("rock",
                "Rock type Pokemon are weak against water, fighting, steel, and grass moves. " +
                        "Rock type moves are good against ice, flying, fire, and bug Pokemon. " +
                        "Rock type moves are weak against ground, steel, grass, and fighting Pokemon.");
        types.put("steel",
                "Steel type Pokemon are weak against fighting and fire moves, and they are immune " +
                        "to poison type moves. " +
                        "Steel type moves are good against ice, rock, and fairy Pokemon. " +
                        "Steel type moves are weak against steel, and fire Pokemon.");
        types.put("fairy",
                "Fairy type Pokemon are weak against steel and poison type moves, and they are immune " +
                        "to dragon type moves. " +
                        "Fairy type moves are good against dragon, dark, and ghost Pokemon. " +
                        "Fairy type moves are weak against steel, poison, and fire Pokemon.");

    }
}