package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavenholdtAssassin_134 : Card() {
    override val id = 134
    override val name = "拉文霍德刺客"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "把姓名和10000金币打包邮寄给他。剩下的他会帮你搞定。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e57bf7e2723d1736d36afdf5f7c25a604fdb88f83d090f2ccf4ab182a1fdfb21.png"
}
