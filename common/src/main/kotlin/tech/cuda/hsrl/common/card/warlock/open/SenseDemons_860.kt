package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SenseDemons_860 : Card() {
    override val id = 860
    override val name = "感知恶魔"
    override val description = "从你的牌库中抽两张恶魔牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "一般说来，恶魔总是比较容易辨认的，不需要用一个法术来感知它们。"
    override val artist = "Raven Mimura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd13a363e17f1d2ce9d5c3081c64b1f226258f2d0896beed2a3e2f05a1faed7c.png"
}
