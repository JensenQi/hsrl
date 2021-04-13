package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoldierOfFortune_53171 : Card() {
    override val id = 53171
    override val name = "散财军士"
    override val description = "每当该随从进行攻击，使你的对手获得一个幸运币。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "千金散尽划不来。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/510f630ab99442a719d8aa7cea39e6d6140927b2458420e1ba69fae4f84d752e.png"
}
