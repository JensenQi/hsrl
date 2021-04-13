package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UsherOfSouls_38898 : Card() {
    override val id = 38898
    override val name = "渡魂者"
    override val description = "每当一个友方随从死亡，使你的克苏恩 获得+1/+1<i>（无论它在哪里）。</i>"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "自从有了好向导，妈妈再也不用担心我的灵魂会迷路了！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f157c633d606b048c2305e9753bc5e98f2be6a210a24ab0a3b041bb64d0b0626.png"
}
