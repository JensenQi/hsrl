package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyNova_69508 : Card() {
    override val id = 69508
    override val name = "神圣新星"
    override val description = "对所有敌方随从造成 2点伤害，为所有友方角色恢复 2点 生命值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "没有得到圣光眷顾的人切忌使用这个法术，它滋润善者，惩罚恶徒。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad5a88890772a01c13378b3e098737fd7407dd80fdac69ec08dda42ae9b57ace.png"
}
