package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnwillingSacrifice_42391 : Card() {
    override val id = 42391
    override val name = "强制牺牲"
    override val description = "选择一个友方随从，消灭该随从和一个随机敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "就站在……那儿。很好，很好！现在别动。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/996ca0e003a1bd0a31e89193690661ebce790cc65f5793cb2afb4a37a80ba961.png"
}
