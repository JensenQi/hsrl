package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InfestedTauren_38784 : Card() {
    override val id = 38784
    override val name = "被感染的牛头人"
    override val description = "<b>嘲讽</b> <b>亡语：</b>召唤一个2/2的泥浆怪。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "科普卢星区的主宰和上古之神有很多相似之处。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d211c2d048f695c3f90b561aa8074af61374c210c88d49fe6aeb53dd37aec4f4.png"
}
