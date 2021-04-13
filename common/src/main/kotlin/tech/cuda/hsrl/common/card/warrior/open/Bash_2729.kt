package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bash_2729 : Card() {
    override val id = 2729
    override val name = "怒袭"
    override val description = "造成 3点伤害。获得3点 护甲值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "需要付出多少的努力和汗水，才能挥出如此漂亮的一击。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f5ccafedab7c64d5b1e5d7cb82c92a2accfe058370498d682e22c6f26cf2f5e3.png"
}
