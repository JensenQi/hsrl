package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BestialWrath_69970 : Card() {
    override val id = 69970
    override val name = "狂野怒火"
    override val description = "在本回合中，使一个野兽获得+2攻击力和<b>免疫</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "盛燃的愤怒掩藏于表面之下，同时还伴随着野性的狂放不羁和些许傲慢。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68f36f22ab1c8a853d82dd928de6750b08bf364e133a0a1824922593565ae47a.png"
}
