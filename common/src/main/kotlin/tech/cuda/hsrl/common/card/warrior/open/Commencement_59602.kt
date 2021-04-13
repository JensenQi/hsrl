package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Commencement_59602 : Card() {
    override val id = 59602
    override val name = "毕业仪式"
    override val description = "从你的牌库中召唤一个随从。使其获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“毕业生，你要记住——今后你肩上的分量会很重。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a0d34bdf5d08193838d4be387f28d469f0de31ff9a9485125ef94ca1bdd6a28f.png"
}
