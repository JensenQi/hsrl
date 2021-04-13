package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimPatron_2279 : Card() {
    override val id = 2279
    override val name = "恐怖的奴隶主"
    override val description = "在该随从受到伤害并没有死亡后，召唤另一个恐怖的奴隶主。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "如果你喜欢自己脸被打肿的样子，就请来到黑铁酒吧！"
    override val artist = "Bobby Chiu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a6504b9f0534acdcbed709d9eec6bb1456542a61c1c54459f0dc8f52b740ab32.png"
}
