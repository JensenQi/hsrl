package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BestialWrath_903 : Card() {
    override val id = 903
    override val name = "狂野怒火"
    override val description = "在本回合中，使一个友方野兽获得+2攻击力和<b>免疫</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "盛燃的愤怒掩藏于表面之下，同时还伴随着野性的狂放不羁和些许傲慢。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58f9ddd82918c2bac8c95b350b9ead10582ec63c86d090ef54d2e96af0456df3.png"
}
