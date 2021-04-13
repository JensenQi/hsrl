package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveSheep_2044 : Card() {
    override val id = 2044
    override val name = "自爆绵羊"
    override val description = "<b>亡语：</b>对所有随从造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "这项武器究竟应该怎么使用？让你的敌人觉得它很可爱然后指望他会把它抱起来？"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/314edaaade46af32acdc609b5a8c5242484fec7678fbea86dc5959ba487736de.png"
}
