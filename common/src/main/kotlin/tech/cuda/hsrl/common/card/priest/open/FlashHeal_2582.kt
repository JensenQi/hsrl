package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlashHeal_2582 : Card() {
    override val id = 2582
    override val name = "快速治疗"
    override val description = "恢复 5点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "快治……英雄阵亡！"
    override val artist = "Marcelo Vignali"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f3a6bf16fa75f7cbea9042895e59a5df28f0a992f3f3fb387710dcd1bb22175.png"
}
