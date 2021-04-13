package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SenseDemons_69922 : Card() {
    override val id = 69922
    override val name = "感知恶魔"
    override val description = "从你的牌库中抽两张恶魔牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "一般说来，恶魔总是比较容易辨认的，不需要用一个法术来感知它们。"
    override val artist = "Raven Mimura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7be0a7ef9dee22a01842d20e7f2b7cacc503585dfbc388deebea516920d8dc7d.png"
}
