package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodImp_69751 : Card() {
    override val id = 69751
    override val name = "鲜血小鬼"
    override val description = "<b>潜行</b> 在你的回合结束时，随机使另一个友方随从获得+1生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "小鬼喜欢躲在暗处嘲讽附近的所有人，并且对此乐此不疲。"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/060a1f36e9dc0d1092eb01df739195541b1a4c622fe5dc2b7574712ca12a1354.png"
}
