package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HealingRain_46067 : Card() {
    override val id = 46067
    override val name = "治疗之雨"
    override val description = "恢复 12点生命值，随机分配到所有友方角色上。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "雨水里全是电解质！"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b5689b6de74e914537e7c01149935e1cda4889e39593ca7bdcf3a56be699f3c.png"
}
