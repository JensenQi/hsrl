package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MischiefMaker_53582 : Card() {
    override val id = 53582
    override val name = "捣蛋鬼"
    override val description = "<b>战吼：</b>交换你和对手的牌库顶的一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "她原本想用愤怒的小鸡和你交换来着。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53a6f2435b2b5325d1a91a6b2d025ec69aedc50cc5b6af24d7ee28ffec1c9456.png"
}
