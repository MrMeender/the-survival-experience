package the_survival_experience.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class AliveBushBlock extends Block {

	public AliveBushBlock() {
		super(Block.Properties.of(Material.PLANT)
            .strength(0, 0)
			.noCollission()
			.noOcclusion()
            .sound(SoundType.GRASS));
	}
		
}