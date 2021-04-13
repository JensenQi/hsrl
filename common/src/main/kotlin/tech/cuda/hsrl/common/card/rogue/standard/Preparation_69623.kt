package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Preparation_69623 : Card() {
    override val id = 69623
    override val name = "伺机待发"
    override val description = "在本回合中，你所施放的下一个法术的法力值消耗减少（2）点。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "“随时准备伺机待发。”——潜行者座右铭"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05420818fbb9e2333767763f4630e94db67499e1fdb16dcf86f6590ee141229b.png"
}
