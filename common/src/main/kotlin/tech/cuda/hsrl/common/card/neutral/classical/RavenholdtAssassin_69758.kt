package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavenholdtAssassin_69758 : Card() {
    override val id = 69758
    override val name = "拉文霍德刺客"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "把姓名和10000金币打包邮寄给他。剩下的他会帮你搞定。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbfe32605b33ba592c5b1ac772e73eddbc14897a898123c7f0ae8c4698d2045d.png"
}
