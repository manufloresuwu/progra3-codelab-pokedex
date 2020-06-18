package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Ban", R.drawable.ban, "Inmortal"));
        pokemons.add(new Pokemon(13, "Gowther", R.drawable.gowther, "Wizard"));
        pokemons.add(new Pokemon(14, "Jericho", R.drawable.jericho, "Knight"));
        pokemons.add(new Pokemon(15, "Scannor", R.drawable.scannor, "Human"));
        pokemons.add(new Pokemon(16, "Diane", R.drawable.diane, "Gigant"));
        pokemons.add(new Pokemon(17, "Hawk", R.drawable.hawk, "Caos"));
        pokemons.add(new Pokemon(18, "Elizabeth", R.drawable.elizabeth, "Goddess"));
        pokemons.add(new Pokemon(19, "King", R.drawable.king, "Fairy"));
        pokemons.add(new Pokemon(20, "Merlin", R.drawable.merlin, "Wizard"));
        pokemons.add(new Pokemon(21, "Meliodas", R.drawable.meliodas, "Demon"));
        return pokemons;
    }
}
