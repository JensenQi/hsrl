package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hallucination_42011 : Card() {
    override val id = 42011
    override val name = "幻觉"
    override val description = "<b>发现</b>一张你对手职业的卡牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "是好的那种幻觉。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22f821841e4ccfbdac5af1f0a01d7b41388dc44e5181b25b9d8ca6ae61d26d42.png"
}
