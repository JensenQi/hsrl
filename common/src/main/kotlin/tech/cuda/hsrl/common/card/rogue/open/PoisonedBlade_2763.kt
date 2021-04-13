package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PoisonedBlade_2763 : Card() {
    override val id = 2763
    override val name = "淬毒利刃"
    override val description = "你的英雄技能不会取代该武器，改为+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "想知道一把浸满毒液的匕首能有多毒吗？找个食人魔捅一下你就知道了。"
    override val artist = "Nutthapon Petchthai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d84cab9a814aa036c96bdf862548fc9ea662667b5685a943b46fc19e58fae5b.png"
}
