package net.fabricmc.yggdrasil.mob.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ZombyEntity extends HostileEntity implements IAnimatable {
    public ZombyEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    private final AnimationFactory factory = new AnimationFactory(this);


    public static DefaultAttributeContainer.Builder createZombieAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.add(2, new LookAroundGoal(this));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.add(2, new RevengeGoal(this, new Class[0]));
    }

    protected void mobTick() {
        super.mobTick();

        if (this.getTarget() != null && this.canAttack()) {
            this.attackTarget();
        }
    }

    private boolean canAttack() {
        return this.getTarget() instanceof PlayerEntity && this.getAttacking() != null && this.canSee(this.getTarget());
    }

    private void attackTarget() {
        if (this.getTarget() instanceof PlayerEntity) {
            PlayerEntity target = (PlayerEntity) this.getTarget();
            double attackDamage = this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
            target.damage(DamageSource.mob(this), (float) attackDamage);
        }
    }

    public void setTarget(@Nullable LivingEntity target) {
        if (target instanceof PlayerEntity) {
            this.setAttacking((PlayerEntity)target);
        }
        super.setTarget(target);
    }

    public boolean canSpawn(WorldView world) {
        return world.doesNotIntersectEntities(this) && !world.containsFluid(this.getBoundingBox());
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_ZOMBIE_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_ZOMBIE_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_ZOMBIE_DEATH;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.zombie.attack_bare_hand", true));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.zombie.swimming", true));
        return PlayState.CONTINUE;
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_ZOMBIE_STEP, 0.15f, 1.0f);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this,
                "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
