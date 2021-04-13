package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodImp_469 : Card() {
    override val id = 469
    override val name = "鲜血小鬼"
    override val description = "<b>潜行</b> 在你的回合结束时，随机使另一个友方随从获得+1生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "小鬼喜欢躲在暗处嘲讽附近的所有人，并且对此乐此不疲。"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8c1843e46868b617603d5bf20b201ff21b64a3ab1bbfc3a56501f3fbab2d900.png"
}
