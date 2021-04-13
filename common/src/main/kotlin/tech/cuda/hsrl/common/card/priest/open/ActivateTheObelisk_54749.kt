package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ActivateTheObelisk_54749 : Card() {
    override val id = 54749
    override val name = "激活方尖碑"
    override val description = "<b>任务：</b>恢复15点生命值。<b>奖励：</b>方尖碑之眼。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "石碑一只眼，怪盗疗伤黄沙反。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a811a2688709f9eccdf1efb9beb10ee35e36eaa99af5b93c2b8b846fef947090.png"
}
