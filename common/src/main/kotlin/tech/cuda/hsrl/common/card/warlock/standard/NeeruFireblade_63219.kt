package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NeeruFireblade_63219 : Card() {
    override val id = 63219
    override val name = "尼尔鲁·火刃"
    override val description = "<b>战吼：</b>如果你的牌库中没有牌，则打开一座传送门，每回合为你召唤数个3/2的小鬼，直到你的随从数量达到上限。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "我一眼就看出他不是个好人！绝对不是！！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c7deea7a063375b0b2766175e0179baf041d37d1f42df92f23ef2dce0694b50.png"
}
