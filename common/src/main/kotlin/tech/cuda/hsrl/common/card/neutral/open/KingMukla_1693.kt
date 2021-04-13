package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingMukla_1693 : Card() {
    override val id = 1693
    override val name = "穆克拉"
    override val description = "<b>战吼：</b>使你的对手获得两根香蕉。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "穆克拉在哈圭罗岛上徘徊，寻找他的真爱。"
    override val artist = "Sunny Gho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd4ef8fa7987c5b64d12e3f7e9b1750e36c00a1527e231572c4a0d8b83909a20.png"
}
