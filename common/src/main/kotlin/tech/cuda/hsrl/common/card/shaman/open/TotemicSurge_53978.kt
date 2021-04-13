package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemicSurge_53978 : Card() {
    override val id = 53978
    override val name = "图腾潮涌"
    override val description = "使你的图腾获得+2攻击力。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "只要画上生气的眉毛，它们就成了愤怒的图腾。"
    override val artist = "Servando Lupini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e24ff7a2b89652314a138f448446642f1a9f756fbbe05a4a704d056558fe57f3.png"
}
