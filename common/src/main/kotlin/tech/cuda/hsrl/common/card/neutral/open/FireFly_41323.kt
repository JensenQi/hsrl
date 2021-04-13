package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireFly_41323 : Card() {
    override val id = 41323
    override val name = "火羽精灵"
    override val description = "<b>战吼：</b>将一张1/2的元素牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "拿着空瓶的孩子们，是他们的天敌。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57ac1d8e40ec673506d1b6e09359e76cdeeaed94f325e8a713a7b4cbd1c9bc59.png"
}
