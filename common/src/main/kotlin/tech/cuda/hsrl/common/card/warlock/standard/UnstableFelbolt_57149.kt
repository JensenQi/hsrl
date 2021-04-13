package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnstableFelbolt_57149 : Card() {
    override val id = 57149
    override val name = "不稳定的邪能箭"
    override val description = "对一个敌方随从和一个随机友方随从造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "警告！你的随从处于易受波及的危险区域。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa98a5cc38a77691417c51804a9f4c52929eb3d394e0b870ca81c3e312fa3f2c.png"
}
