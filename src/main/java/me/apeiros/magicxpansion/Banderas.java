package me.apeiros.magicxpansion;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

/**
 * Aplica banderas de visualizacion a un objeto.
 *
 * POR QUE
 *
 * El addon llamaba a {@code SlimefunItemStack#addFlags}, un atajo que la API de Slimefun ya no
 * ofrece. Hoy hay que pasar por el ItemMeta: leerlo, marcarlo y devolverlo.
 *
 * OJO CON EL MOMENTO: un SlimefunItemStack se bloquea al registrarse y a partir de ahi
 * {@code setItemMeta} lanza excepcion. Esto solo puede llamarse mientras se define el objeto --
 * que es donde el addon lo hacia, en bloques static --, nunca despues.
 */
public final class Banderas {

    private Banderas() {}

    /** Marca el objeto con las banderas indicadas. Debe usarse antes de registrarlo. */
    public static void ocultar(@NotNull ItemStack item, @NotNull ItemFlag... banderas) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) {
            return;
        }
        meta.addItemFlags(banderas);
        item.setItemMeta(meta);
    }
}
