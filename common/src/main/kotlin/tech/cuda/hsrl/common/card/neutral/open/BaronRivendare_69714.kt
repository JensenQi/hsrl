package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaronRivendare_69714 : Card() {
    override val id = 69714
    override val name = "瑞文戴尔男爵"
    override val description = "你的随从的<b>亡语</b>将触发两次。"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "整天和三个吵吵嚷嚷打打杀杀的男人们为伍，布劳缪克丝女士总是担心自己会老得很快。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ce2f66728da2d7e123b2f37819ed1cdf0f6ecc298b30a2e7212a3ef59c3aff2.png"
}
