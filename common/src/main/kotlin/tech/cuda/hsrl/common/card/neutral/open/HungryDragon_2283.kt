package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HungryDragon_2283 : Card() {
    override val id = 2283
    override val name = "饥饿的巨龙"
    override val description = "<b>战吼：</b>为你的对手随机召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "它其实不太愿意吃1点法力值召唤出来的随从，那些肉都不够它塞牙缝的。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab6bf942507b7253d52c2ab09104a211e86b9f13193e01414490d78792e85c90.png"
}
