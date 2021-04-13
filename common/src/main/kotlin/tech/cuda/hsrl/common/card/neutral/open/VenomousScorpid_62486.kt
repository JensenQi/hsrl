package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VenomousScorpid_62486 : Card() {
    override val id = 62486
    override val name = "剧毒魔蝎"
    override val description = "<b>剧毒</b> <b>战吼：</b><b>发现</b>一张法术牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "不管古夫怎么说，这绝对不是个“可爱的小家伙”。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/73bf4c59278fdfedbc92a78e5008e72d4ed8daf0875cbc9961b56c247b622197.png"
}
