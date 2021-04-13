package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimestreetSmuggler_40743 : Card() {
    override val id = 40743
    override val name = "污手街走私者"
    override val description = "<b>战吼：</b>随机使你手牌中的一张随从牌获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "无论你想要什么，她都能给你弄来！"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e334323869fd58284fb507c6b3479a26b66511e183b69c77994de8be2147612.png"
}
