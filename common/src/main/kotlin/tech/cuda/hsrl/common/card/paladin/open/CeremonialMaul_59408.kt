package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CeremonialMaul_59408 : Card() {
    override val id = 59408
    override val name = "仪式重槌"
    override val description = "<b>法术迸发：</b>召唤一个属性值等同于法术法力值消耗的并具有<b>嘲讽</b>的学生。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "专为纪律委员设计。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c1dc460b527ae76e56c063bb178a1ea4167a5db87b30dfa496bff3e11e62580.png"
}
