package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LivingRoots_2792 : Card() {
    override val id = 2792
    override val name = "活体根须"
    override val description = "<b>抉择：</b>造成 2点伤害；或者召唤两个1/1的树苗。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "两个树苗举手表决，支持你选择召唤树苗。"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2715bfd6e54c45f57e84830d3cab133a03685ce693462d4fcd80a801f3341cbc.png"
}
