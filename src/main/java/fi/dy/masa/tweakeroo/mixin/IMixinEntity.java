package fi.dy.masa.tweakeroo.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Entity.class)
public interface IMixinEntity
{
    @Invoker("getRotationVector")
    Vec3d tweakeroo_getRotationVector(float pitch, float yaw);
}
