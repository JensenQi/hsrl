package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingMukla_69814 : Card() {
    override val id = 69814
    override val name = "穆克拉"
    override val description = "<b>战吼：</b>使你的对手获得两根香蕉。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "穆克拉在哈圭罗岛上徘徊，寻找他的真爱。"
    override val artist = "Sunny Gho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53fcf48c3b9e75403ee012366b7bb2d159f5b4e77df970a068d1488c6cff4984.png"
}
