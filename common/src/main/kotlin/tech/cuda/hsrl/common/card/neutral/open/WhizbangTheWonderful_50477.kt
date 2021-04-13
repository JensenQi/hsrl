package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhizbangTheWonderful_50477 : Card() {
    override val id = 50477
    override val name = "神奇的威兹班"
    override val description = "你改用威兹班的一副梦幻套牌来开始 对战！"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "来自西部荒野久负盛名的魔法家族。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91355a509f96c1673d6e3d209b46c9fa2ad460ba134ecead97a44edab7ef1f10.png"
}
