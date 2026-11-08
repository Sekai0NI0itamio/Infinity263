package itamio.infinity.mixin;

import net.minecraft.world.item.enchantment.ArrowInfiniteEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Port of GoForceX's InfinityEnchantmentMixin: allow Infinity and
 * Mending together. In 1.20.1 enchantments are class-based and the
 * Infinity enchantment (ArrowInfiniteEnchantment) vetoes Mending in
 * checkCompatibility, so we force that check to pass for Mending.
 */
@Mixin(ArrowInfiniteEnchantment.class)
public class ArrowInfiniteEnchantmentMixin {
    @Inject(method = "checkCompatibility", at = @At("HEAD"), cancellable = true)
    private void infinity263$allowInfinityWithMending(
            Enchantment other, CallbackInfoReturnable<Boolean> cir) {
        if (other == Enchantments.MENDING) {
            cir.setReturnValue(true);
        }
    }
}
