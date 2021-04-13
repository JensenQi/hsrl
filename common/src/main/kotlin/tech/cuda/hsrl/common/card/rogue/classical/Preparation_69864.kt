package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Preparation_69864 : Card() {
    override val id = 69864
    override val name = "伺机待发"
    override val description = "在本回合中，你所施放的下一个法术的法力值消耗减少（3）点。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "“随时准备伺机待发。”——潜行者座右铭"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7bf0d7943e4d8080980418d1c90e47799f672dbc1fc9ec121893006c85fc4b43.png"
}
