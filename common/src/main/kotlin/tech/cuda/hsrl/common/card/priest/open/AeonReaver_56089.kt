package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AeonReaver_56089 : Card() {
    override val id = 56089
    override val name = "永恒掠夺者"
    override val description = "<b>战吼：</b>对一个随从造成等同于其攻击力的伤害。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "他会把永恒的时间撕成碎片，这样有助于管理繁忙的日程。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd97b8095f6709ac185010e90b20f8fb1d5ea7883ac142de7648b903cf216ee4.png"
}
