package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwistedWorgen_38781 : Card() {
    override val id = 38781
    override val name = "扭曲的狼人"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "被上古之神腐化后，有时会获得无穷的力量，有时仅仅获得+1攻击力。不可能每个人都是幸运儿，主要看气质。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/70512d83f60a10357a22a15cdd0337be4c03a37e499b49958686cf4278733ac1.png"
}
