package itamio.infinity.mixin;

import net.minecraft.core.Holder;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Port of GoForceX's InfinityEnchantmentMixin: allow Infinity and
 * Mending together. In 26.3 enchantments are records and compatibility
 * is decided by the static Enchantment.areCompatible(Holder, Holder),
 * so we cancel that check for the Infinity/Mending pair.
 */
@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @Inject(method = "areCompatible", at = @At("HEAD"), cancellable = true)
    private static void infinity263$allowInfinityWithMending(
            Holder<Enchantment> first, Holder<Enchantment> second,
            CallbackInfoReturnable<Boolean> cir) {
        boolean firstInfinity = first.unwrapKey().map(k -> k.equals(Enchantments.INFINITY)).orElse(false);
        boolean firstMending = first.unwrapKey().map(k -> k.equals(Enchantments.MENDING)).orElse(false);
        boolean secondInfinity = second.unwrapKey().map(k -> k.equals(Enchantments.INFINITY)).orElse(false);
        boolean secondMending = second.unwrapKey().map(k -> k.equals(Enchantments.MENDING)).orElse(false);
        if ((firstInfinity && secondMending) || (firstMending && secondInfinity)) {
            cir.setReturnValue(true);
        }
    }
}
