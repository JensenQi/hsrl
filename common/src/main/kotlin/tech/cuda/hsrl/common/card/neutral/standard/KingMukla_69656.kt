package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingMukla_69656 : Card() {
    override val id = 69656
    override val name = "穆克拉"
    override val description = "<b>战吼：</b>使你的对手获得两根香蕉。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "穆克拉在哈圭罗岛上徘徊，寻找他的真爱。"
    override val artist = "Sunny Gho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c193edb72f93701919df9292f7b73e6a5a3a4b5c8b927d3133963881e7582749.png"
}
